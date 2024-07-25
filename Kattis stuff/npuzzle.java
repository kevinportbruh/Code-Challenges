import java.util.*;
//@author Kevin Portillo, Self-Proclaimed Code Wizard 🧙‍♂️
public class npuzzle {
    

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
     

        HashMap<Integer, Tuple> map = new HashMap<Integer, Tuple>();

        HashMap<Character, Tuple> inMap = new HashMap<Character, Tuple>();
  
        int idx=0;

        for(int i =0; i<4; i++){
            for(int j=0; j<4; j++){
                map.put(idx, new Tuple(i, j));
                idx++;
            }
        }
        Integer.M

        String line;
        for(int i=0;i<4;i++){
            line = kb.nextLine();
            char[] arr = line.toCharArray();
            for(int j=0;j<4;j++){
                char temp = arr[j];
                //System.out.println(temp + " " + i + " " + j);
                inMap.put(temp, new Tuple(i, j));
            }
        }

        //4 lines
        //String line1 = kb.next();       //abcd  
        //String line2 = kb.next();       //efgh
        //String line3 = kb.next();       //ijkl
        //String line4 = kb.next();       //mno. is the puzzle if all but the final line is the same with it being m.no the scatter is 2

        /** 
            char bruh = 'A';
            for(int i=0;i<15;i++){
                System.out.println(i+" "+map.get(i).x + " " + map.get(i).y);
                System.out.println(bruh+" "+inMap.get(bruh).x + " " + inMap.get(bruh).y);
                bruh++;
                if(bruh == 'P'){
                    bruh = '.';
                }
            }
        */
        

        //scatter is the sum of distances between each square current pos and its pos in disered state
        //the distance is manhattan distance abs val of diff between 2 rows and 2 column
        int scatter = 0;
        char c = 'A';
        for(int i=0;i<15;i++){
           //System.out.println(c);
           Tuple t = inMap.get(c);

           Tuple t2 = map.get(i);

           if(t.x != t2.x || t.y != t2.y){
                scatter += Math.abs(t.x - t2.x) + Math.abs(t.y - t2.y);  
           }
           c++;
           if(c == 'P'){
               c = '.';
           }
        }

        
        System.out.println(scatter);


        
    }

}
