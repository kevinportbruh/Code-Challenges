import java.util.*;
//@author Kevin Portillo, Self-Proclaimed Code Wizard 🧙‍♂️
public class addingwords {
  
    /*
     * algorithim for this one,
     * make hashmap <string, integer> 
     * 
     * if input is def, then add the string and integer to the hashmap
     * when we see calc just replace the string with the integer and do the math
     * if not defined print unknown
     */
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        HashMap<Integer, String> map2 = new HashMap<Integer, String>(); //backwards lookup
        Scanner kb = new Scanner(System.in);
        while(kb.hasNextLine()){
            String line = kb.nextLine();
            String[] temp = line.split(" ");
            if(temp[0].equals("def")){
                map.put(temp[1], Integer.parseInt(temp[2]));
                map2.put(Integer.parseInt(temp[2]), temp[1]);
            }
            else if(temp[0].equals("clear")){
                map.clear();
                map2.clear();
            }else if(temp[0].equals("calc")){
                //will be followed by 1 to 15 variables seperated by operands
                int total=0;
                int num=0;
                int flag=-1;// -1 is nothing, 0 is +, 1 is -
                
                for(int i=1;i<temp.length;i++){
                    if(temp[i].equals("+")){
                        flag = 0;

                    }
                    else if(temp[i].equals("-")){
                        flag =1;
                    }
                    else if(temp[i].equals("=")){

                        if(map2.containsKey(total)){
                            System.out.println(line.substring(5, line.length()) + " "+ map2.get(total));
                        }else{
                            System.out.println(line.substring(5, line.length()) + " unknown");
                        }
                        
                    }
                    else{
                        if(flag == -1){
                            if(map.containsKey(temp[i])){
                                total = map.get(temp[i]);
                                //System.out.println(total);
                            }else{
                                System.out.println(line.substring(5, line.length()) + " unknown");
                                break;
                            }
                        }else{
                            if(map.containsKey(temp[i])){
                                if(flag==0){
                                    total+= (map.get(temp[i]));
                                }else{
                                    total-= (map.get(temp[i]));
                                }
                                flag = -1;
                            }else{
                                System.out.println(line.substring(5, line.length()) + " unknown");
                                break;
                            }
                        }

                       
                        
                    }

                }

            }
        }
    }
    
}
