import java.util.*;
//@author Kevin Portillo, Self-Proclaimed Code Wizard 🧙‍♂️
public class expeditiouscubing {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double[] arr = new double[4];
        for(int i=0; i<4; i++){
            arr[i] = kb.nextDouble();
        }
        double x = kb.nextDouble(); // worst final score


        Arrays.sort(arr);

        // this avg assumes arr[0] is best case and our new score is the worst case thus dropped
        double avg = (arr[1] + arr[2] + arr[3])/3.0; // avg of the 3 worst scores, 
        double avg2 = (arr[0] + arr[1] + arr[2])/3.0; // avg of the 3 best scores
        
        // if the avg of these 3 is less than x then we can do as bad as we want and we win
        // else we gotta do some 
        if(avg2>x){
            System.out.println("impossible");
        }
        else if (avg <=x){
            System.out.println("infinite");
        }else{
            //this considers that arr[3] is the worst score to be dropped and arr[0] will also be dropped

            //(t1 + t2 + y)/3 = x -> t1 + t2 + y = 3x -> y = 3x - t1 - t2
            //if y is less than our best score then we cant win, as if we do that good 
            //else print y
            double y = 3*x - arr[1] - arr[2];
            Math.ceil(y);

        
            System.out.printf("%.2f",y);
        }



    }


}
