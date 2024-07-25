import java.util.*;
//@author Kevin Portillo, Self-Proclaimed Code Wizard 🧙‍♂️
public class goodmorning {


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int t = 0;
        t=kb.nextInt();
        String ans="";
        int k=0;
        int colIdx=0;// if -1 then we picked 0 and cannot press another button
        int[] row1 = {1,2,3};
        int[] row2 = {4,5,6};
        int[] row3 = {7,8,9};

        

        for(int i =0;i<t;i++){
            k=kb.nextInt();//k cannot be more than 200, find if it has a 100th place
            int hundred = k/100;
            if(hundred != 0){
                // was going to do iterative solution but that one sucks
                //make list of all possible numbers <200 that I can make given my first digit?
                //check
            }

        }


    }



}
