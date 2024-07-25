import java.util.*;
//@author Kevin Portillo, Self-Proclaimed Code Wizard 🧙‍♂️
public class lawnmower {
    
    public static class Tuple{
      
        Double x;
        Double y;
        public Tuple(Double x, Double y){
            this.x = x;
            this.y = y;
        }
    }
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String inLine = kb.nextLine();
  

        //length of field is always 100
        //width of field is always 75



        
        while(true){
            String [] arr = inLine.split(" ");
            int nx = Integer.parseInt(arr[0]);
            int ny = Integer.parseInt(arr[1]);
            double w = Double.parseDouble(arr[2]);
            if(nx == 0 && ny == 0 && w == 0.0){
                break;
            }



            String[] line1 = kb.nextLine().split(" ");// will have nx elem
            String[] line2 = kb.nextLine().split(" ");// will have ny elem
            //guido passes the center of the lawnmower at the middle of the nx/ny number, so if nx =10 and w =2 he cut from 9-11
            //so make a tuple of the start and end of the cut for each nx or ny
            //then see if the ranges cover the entire field
           
            ArrayList<Tuple> nxs = new ArrayList<Tuple>();
            ArrayList<Tuple> nys = new ArrayList<Tuple>();
            for(int i=0; i<nx; i++){
                double x = Double.parseDouble(line1[i]);
                nxs.add(new Tuple(x-w/2, x+w/2));
            }
            for(int i=0; i<ny; i++){
                double y = Double.parseDouble(line2[i]);
                nys.add(new Tuple(y-w/2, y+w/2));
            }
            //sort the tuples by the start of the cut
            nxs.sort((a,b)->a.x.compareTo(b.x));
            nys.sort((a,b)->a.x.compareTo(b.x));

            boolean x = helper(nxs, 75) && helper(nys, 100);
      
            System.out.printf("%s\n", x ? "YES" : "NO");

            inLine = kb.nextLine();
        }

    }


    public static boolean helper(ArrayList<Tuple> arr, int tgtLength){
        if(arr.size() == 0){
            return false; // no cuts
        }
        Tuple prevTuple = null;
        for (Tuple currTuple : arr) {
            if (prevTuple != null && prevTuple.y < currTuple.x) {
                //System.out.println(prevTuple.y + "--bruh" + currTuple.x); //test print
                return false;
            }
            prevTuple = currTuple;
        }
        
        /** testing
        for(Tuple t: arr){
            System.out.println(t.x + "--" + t.y)
            System.out.println(arr.get(arr.size()-1).x + "--" + arr.get(arr.size()-1).y);
        }
        */
        //if the last cut ends before the end of the field then we have a gap
        if(arr.get(arr.size()-1).y < tgtLength){
            return false;
        }

        return true;

    }


}
