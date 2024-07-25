import java.util.Scanner;
import java.util.HashMap;
import java.util.*;

//@author Kevin Portillo, Self-Proclaimed Code Wizard 🧙‍♂️
public class apples{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int row = kb.nextInt();
        int col = kb.nextInt();
        ArrayList<HashMap<Integer, Character>> map = new ArrayList<HashMap<Integer, Character>>();
     
        // array of hashmaps, each hasmap is a lane (column) of the grid

        //algorithim is like this, fill the grid with input,

        //for each column go to the bottom
        //start crawl up, if we find '.' we count how many consecutive '.' we get
        //untill we find an 'a', then replace the 'a' with the number of consecutive '.' we found
        //repeat for each column
        //if we find a '#' skip and reset the count of consecutive '.' to 0 and start up
        
        //init
        for(int i = 0; i<row;i++){
            map.add(new HashMap<Integer, Character>());
        }

       
        System.out.println(map.size()); //debug

        //get input and fill the grid
        for(int i = 0; i<row;i++){
            
            String c = kb.next();
            char[] temp = c.toCharArray();
           // System.out.println(temp.length + " "+ c);
            for(int j=0;j<col;j++){
                map.get(i).put(j, temp[j]);  
                
            }
        }
        
        //start at bottom of each column got up and replace 'a' with number of consecutive '.'
        int count = 0;
        for(int j = 0; j < col; j++){
            for(int i = row-1; i>=0; i--){
                if(map.get(i).get(j) == '.'){
                    count++;
                }
                else if(map.get(i).get(j) == 'a'){
                    map.get(i).put(j, '.');
                    map.get(i+count).put(j, 'a');
                }
                else if(map.get(i).get(j) == '#'){
                    count = 0;
                }
            }
            count = 0;

        }

 
        //System.out.println("\n\n\n\n\n");

        //
        for(int i = 0; i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(map.get(i).get(j));
            }
            System.out.println();
        }
        
    }
}