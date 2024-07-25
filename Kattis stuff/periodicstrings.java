import java.util.*;
//@author Kevin Portillo, Self-Proclaimed Code Wizard 🧙‍♂️
public class periodicstrings {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = kb.nextLine();
        StringBuilder sb = new StringBuilder();
       
        //find the k-period
        //where length of s is multiple of k
        //so s/k strings of length k are repeated
        // abc, cba, bac, abc, 
        //start from 1 to s.length and mod s.length by that i
       
        boolean found = false;
        for(int i =1; i <s.length();i++){
           if(s.length()%i == 0){
                String sub = s.substring(0,i);
                int k = sub.length();//k period/window size
                String[] arr = new String[s.length()/k];
                for(int j = 0; j < s.length(); j+=k){
                    arr[j/k] = s.substring(j,j+k);
                }
                sb.append(sub); // sb == sub
                StringBuilder temp = new StringBuilder(sb.toString());
                for(int j =1;j<arr.length;j++){
                    //remove last char of sb and add to front of temp
                    temp.insert(0,temp.charAt(temp.length()-1));
                    temp.deleteCharAt(temp.length()-1);
                    sb.append(temp); 
                  
                    if(!arr[j].equals(temp.toString())){
                        sb.setLength(0);
                        break;
                    }
                }
                if(s.equals(sb.toString())){
                    System.out.println(k);
                    found = true;
                    break;
                }
           }
        }
        if(!found){
            System.out.println(s.length());
        }

    }


 
   

   
}
