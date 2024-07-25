import java.util.*;
//@author Kevin Portillo, Self-Proclaimed Code Wizard 🧙‍♂️
public class racingalphabet {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ '";
        //each player is given an string. with the letters a space or a '.
        //how fast does the smartest player finish
        //circle diameter is 60ft. 1 random spot is a then cont down the alphabet.
        //start at start letter and run to the next letter. shortest root
        //15ft/s running between stops, each pick up is 1 second, so at at mini time would be s.length() if 0 feet ran
        double c = Math.PI*60; //circumference
        double distanceBetween = c/28;// dis between 2 points
        double speed = 15;//per sec
        double timeToPickUp = 1;//a second per sec
        int n = kb.nextInt();
        //THIS MF WAS THE REASON FIRST CASE WAS WRONG
        kb.nextLine();

        for(int i=0;i<n;i++){
            String s = kb.nextLine();
            int time = 0;
            int cur = alpha.indexOf(s.charAt(0));// 0 based off s string not just 0...
            //System.out.println(s + " "+cur);
            for(int j = 1;j<s.length();j++){
                int next = alpha.indexOf(s.charAt(j));
                //System.out.println(cur+ " "+next);
                //double cw = Math.abs(next-cur);
                //double ccw = 28-cw;
                //double min = Math.min(cw,ccw);
                //one lined ^^ wrong anser on case 1 but correct on case 2, 3
                double min = Math.min(Math.abs(next-cur),28-Math.abs(next-cur));
                time+=min; // seconds to get to the next letter
                cur = next; // DUHHHHHHHH
            }
            //seconds * distance between letters / speed + time to pick up at every letter (s.length())
            System.out.println(time * distanceBetween/speed + s.length()*timeToPickUp);
         
        }

    }

}
