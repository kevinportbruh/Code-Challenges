import java.util.*;
//@author Kevin Portillo, Self-Proclaimed Code Wizard 🧙‍♂️
public class gold {

    public static class Point{
        int x;
        int y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int x = kb.nextInt();
        int y = kb.nextInt();
        char[][] grid = new char[x][y];

        int pX = 0;
        int pY = 0;
        for(int i=0;i<y;i++){
            String line = kb.next();
            for(int j=0;j<x;j++){
                grid[j][i] = line.charAt(j);
                if(grid[j][i] == 'P'){
                    pX = j;
                    pY = i;
                }
            }
        }

      //BFS to find the gold
      System.out.println(bfs(grid,pX,pY));




    }

    public static int bfs(char[][] grid, int x, int y) {
        Point[] moves = { new Point(0, 1), new Point(0, -1), new Point(1, 0), new Point(-1, 0) };
        int count = 0;

        boolean[][] visited = new boolean[grid.length][grid[0].length];
        visited[x][y] = true;

        Queue<Point> q = new LinkedList<>();
        q.add(new Point(x, y));
        while (!q.isEmpty()) {
          
         Point current = q.poll();
          //  System.out.println("Current: "+current.x+" "+current.y);
            for (Point move : moves) {
                int newX = current.x + move.x;
                int newY = current.y + move.y;
                if (newX >= 0 && newX < grid.length && newY >= 0 && newY < grid[0].length && (grid[newX][newY] != '#'||grid[newX][newY] !='T') && !visited[newX][newY]) {
                    if (grid[newX][newY] == 'G') {
                        // //check if t is sturrounded by traps
                        // for(Point move2: moves){
                        //     int newX2 = newX + move2.x;
                        //     int newY2 = newY + move2.y;
                        //     if(newX2 >= 0 && newX2 < grid.length && newY2 >= 0 && newY2 < grid[0].length && grid[newX2][newY2] == 'T'){
                        //         count--; 
                        //     }
                        // }
                            /// this brought my answer a little close ^^^^^

                        //
                        q.add(new Point(newX, newY));
                        visited[newX][newY] = true;
                        count++;
                        //System.out.println("Gold found at: "+newX+" "+newY);
                    }
                    if (grid[newX][newY] == '.') {
                        q.add(new Point(newX, newY));
                        visited[newX][newY] = true;
                    }
                }
            }
        }

        return count;
    }

    
}
