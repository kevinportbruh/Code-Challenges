import java.util.*;
//@author Kevin Portillo, Self-Proclaimed Code Wizard 🧙‍♂️
public class fridge {

    //sample input = 123456789 -> 10

       public static class Tuple{
        int x;
        int y;
        public Tuple(int x, int y){
            this.x = x;
            this.y = y;
        }
    }


        public static void main(String[] args) {
            Scanner kb = new Scanner(System.in);


            //we r given string of AT MOST 1000 digits, no order, those are the avalible digits we can use
            //find the smallest natural number that cannot be made using each digit at most once
            
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); 
            //take a number see how and how many time the digits appears
            String s = kb.next();

            for(int i=0; i<s.length(); i++){
                int x = Character.getNumericValue(s.charAt(i));
                if(map.containsKey(x)){
                    map.put(x, map.get(x)+1);
                }else{
                    map.put(x, 1);
                }
            }



            for(int c : map.keySet()){
                System.err.println(c + " " + map.get(c));
            }

        

            //what is the smallest number that cannot be made using each digit at most once
            //if we have  1, 2, 3, 4, 5, 6, 7, 8, 9 then the smallest number that cannot be made is 10
            //if we have 0 , 1, 2, 3, 4, 5, 6, 7, 8, 9 then the smallest number that cannot be made is 11 

            //if we have 0 in our table then 1 is our smallest
            int smallest = 0;

            int min = Integer.MAX_VALUE;
            int premin =min;
            int idx = 0;
        
       
            for(int i=1;i<10;i++){
                if(map.containsKey(i)){
                    if(map.get(i) < min){
                       smallest =i;
                    }
                    min = Math.min(min, map.get(i));
                }
            }
            System.out.println(smallest + " v1- " + min+ "size" + map.size());

          

            
        

            System.out.println(smallest + " v2- " + min);


            if(!map.constainsKey(0)){
                System.out.println(1);
                smallest = 0;
            }
       
            if(!map.containsKey(smallest)){
                min=0;
            }
          
                for (int i = 0; i < min+1; i++) {
                    System.out.print(smallest);
                }
         
           
           


            



        }


}
