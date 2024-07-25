import java.util.*;
//@author Kevin Portillo, Self-Proclaimed Code Wizard 🧙‍♂️
public class watchdog {
    private static class Point{
        int x;
        int y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t=  kb.nextInt();
        Point[] hatches = new Point[t];

        for(int i=0;i<t;i++){
            int s = kb.nextInt();//is even, the sides of teh square roof
            int h= kb.nextInt();//num of hatches
            for(int j=0;j<h;j++){
                int x = kb.nextInt();
                int y = kb.nextInt();
                hatches[j] = new Point(x,y);
            }
            // out put a point where the dog can be place to reach every hatch
            //10x10, (6,6) adn (5,4) then the dog can be placed at (3,6)



        }




    }
}
