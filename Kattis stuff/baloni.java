import java.util.*;
//@author Kevin Portillo, Self-Proclaimed Code Wizard 🧙‍♂️
// did not finish ):
public class baloni {
    
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];// ballon height array
    
        for(int i =0;i<n;i++){
            arr[i] = kb.nextInt();
            
        }


        // int previous = arr[0];// previous height of ballon
     
        int countArrows = 1;// count of arrows shot       
        int maxh = arr[0];// maximum height of ballon
        for(int i=1; i < n; i++){
            //arrow is flying
            if(arr[i]<= maxh){
                maxh = arr[i]; // the next ballon is <= the maxh so it will be hit
                //System.out.println("maxh: "+maxh+" currentbal: "+arr[i]);
            }else{
                //the next ballon is higher than maxh so we need to shoot another arrow
                countArrows++;
                maxh = arr[i];
                //System.out.println("maxh: "+maxh+" currentbal: "+arr[i]);
            
            }


        }


        // for(int i=1;i<n;i++){
        //     int currentbal= arr[i];// current height of ballon
        //     if(previous -1 == currentbal){
        //         previous = currentbal;
        //         continue;
        //     }else{
        //         maxh=Math.max(maxh,currentbal);
        //         //this new arrow is heigher than the previous
        //         //if we shot this one then the next one may not pop but one down the line will
        //         if(maxh-1 == currentbal){
        //             maxh = currentbal;
        //             previous = currentbal;   
        //             //System.out.println("maxh: "+maxh+" currentbal: "+currentbal);
        //             continue;
        //         }
        //        // System.out.println("maxh: "+maxh+" currentbal: "+currentbal);
        //         countArrows++;
        //         previous = currentbal;
        //     }


        // }
        
          
        System.out.println(countArrows);

    }


}
