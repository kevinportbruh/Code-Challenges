import java.util.*;
//@author Kevin Portillo, Self-Proclaimed Code Wizard 🧙‍♂️
public class cookingwater {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        //first line n 1<=n<=1000
        // then n lines of 2 ints a b 0<=a,b<=1000  
        int n = kb.nextInt();
        int minStart = Integer.MIN_VALUE;
        int maxEnd = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int a = kb.nextInt();
            int b = kb.nextInt();
            
                minStart = Math.max(a,minStart);
            
          
                maxEnd = Math.min(b,maxEnd);
           
        }

        if(minStart>maxEnd){
            System.out.println("edward is right ");//+ minStart + " " + maxEnd);
        }else{
            System.out.println("gunilla has a point");//+ minStart + " " + maxEnd);
        }



    }

}
