import java.util.*;
//@author Kevin Portillo, Self-Proclaimed Code Wizard 🧙‍♂️
public class platforme {

    private static class Platform{
        int x1;
        int x2;
        int y;

        public Platform(int x1, int x2, int y){
            this.x1 = x1;
            this.x2 = x2;
            this.y = y;
        }
    }
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        ArrayList<Platform> platforms = new ArrayList<>();

        int n = kb.nextInt();

        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            int y = kb.nextInt();
            int x1 = kb.nextInt();
            int x2 = kb.nextInt();
            
            platforms.add(new Platform(x1,x2,y));
        }
        for(Platform p:platforms){
            minX = Math.min(minX,p.x1);
            maxX = Math.max(maxX,p.x2);
        }
        Platform base =new Platform(minX,maxX,0); // the floor spanning the entire length of the platforms
        //sort arraylist smallest y first
        platforms.sort((a,b)->a.y-b.y);
        int totalLegLength = 0;
        for(int i = 1;i<platforms.size();i++){
            Platform cur = platforms.get(i);
            if(cur.x1<=base.x2 && cur.x2>=base.x1){
                if(cur.y>base.y){
                    if(cur.y>platforms.get(i-1).y){
                        totalLegLength+=cur.y-platforms.get(i-1).y;
                    }
                    else{
                        totalLegLength+=cur.y-base.y;
                    }
                }
            }

        }
        System.out.println(totalLegLength);




    }
}
