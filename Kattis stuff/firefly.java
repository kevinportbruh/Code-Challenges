import java.util.*;
//@author Kevin Portillo, Self-Proclaimed Code Wizard 🧙‍♂️
public class firefly {
    
    public static void main(String[] args) {
    
        Scanner kb = new Scanner(System.in);
        
        int n=0, h=0;
        n = kb.nextInt();
        h = kb.nextInt();
        int[] arr = new int[h];
        int[] arr2 = new int[h];

        for(int i=0; i<n; i++){
            int temp = kb.nextInt();
            //instead of tallying each spot a stagmite or stalactite is
            //keep track of a second array which is tracks the ceiling arr2

            if(i%2==0){
               arr[temp-1]++; //tally where the stagmite reaches
              
            }
            else{
                arr2[h-temp]++; //tally where the stalactite reaches
            }
        }
        //this is where the magic starts🧙‍♂️
        //now prefix sum the arrays
        //after we prefix sum the arrays it'll represent the number of walls that are at that level certain height
        // like this--> suppose this represeents the floor [x--x-x]-> [3,2,2,1,1]
        // then on level 0 there are 3 walls, on level 1 there are 2 walls, on level 2 there are 2 walls, on level 3 there is 1 wall, on level 4 there is 1 wall
        // if we used that same array and represented the ceiling it would look like this [x--x-x]-> [1,1,2,2,3]
        // then if we add up the two arrays we get [4,3,4,3,4] which represents the number of walls that are at that level        

  
        int min = Integer.MAX_VALUE, count =0, sum = 0;
       
        for(int i=h; i>0; i--){
            sum += arr[i-1];
            arr[i-1] = sum;
        }
        sum = 0;
        for(int i=0; i<h; i++){
            sum+= arr2[i];
            arr2[i] = sum;

        }


       // for(int i=0; i<h; i++){
            //System.out.println(arr[i] + " " + arr2[i]);

        //}

        for(int i=0; i<h; i++){
            if(arr[i] + arr2[i] < min){
                min = arr[i] + arr2[i];
                count = 1;
            }
            else if(arr[i] + arr2[i] == min){
                count++;
            }
        }



        System.out.println(min + " " + count);

    }




}
