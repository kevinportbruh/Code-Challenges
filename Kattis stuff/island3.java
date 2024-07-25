import java.util.*;
public class island3 {


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int x = kb.nextInt();
        int y = kb.nextInt();

        //grid of x by y size
        char[][] grid = new char[x][y];
        boolean[][] visited = new boolean[x][y];

        for(int i=0;i<x;i++){
            String line = kb.next();
            //System.out.println(line);
            for(int j=0;j<y;j++){
                grid[i][j] = line.charAt(j);
                visited[i][j] = false;
            }
        }
        
        for(int i=0;i<x;i++){
            
            //System.out.println(line);
            for(int j=0;j<y;j++){
               System.out.print(grid[i][j]);
            }
            System.out.println();
        }
        System.out.print(grid[0][0]);
        System.out.print(visited[0][0]);
        System.out.println(); System.out.println(); System.out.println(); System.out.println();
        //L represents land, W represents water, C clouds
        // given grid dtermin min num of islands

        //dfs, maybe floodfill? start at a land tile then find how big it is, if its covered by clouds trun the cloud into land and see if we can make the graphs connect
        //essentiall counnt connected components. 
        int count = 0;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                if(grid[i][j] == 'L' && !visited[i][j]){
                    count++;
                    dfs(i, j, grid, visited);
                }
            }
        }
        System.out.println(count);

    }

    static void dfs(int idx, int jdx, char[][] grid , boolean[][] visited){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(idx);
        stack.push(jdx);
        while(!stack.isEmpty()){
            int current = stack.pop();
            int current2 = stack.pop();
            if(visited[current][current2]){
                return;
            }
            //CHECK IF up down left or right are land or clouds if so dfs on them
            int updex = current-1;
            int downdex = current+1;
            int leftdex = current2-1;
            int rightdex = current2+1;
            if((updex <= grid.length || updex >0) && grid[updex][current2] == 'L' || grid[updex][current2] == 'C'){
                stack.push(updex);
                stack.push(current2);
                dfs(updex, current2, grid, visited);
            }
            if(downdex <= grid.length && grid[downdex][current2] == 'L' || grid[downdex][current2] == 'C'){
                stack.push(downdex);
                stack.push(current2);
                dfs(downdex, current2, grid, visited);
            }
            if(leftdex <= grid[0].length && grid[current][leftdex] == 'L' || grid[current][leftdex] == 'C'){
                stack.push(current);
                stack.push(leftdex);
                dfs(current, leftdex, grid, visited);
            }
            if(rightdex <= grid[0].length && grid[current][rightdex] == 'L' || grid[current][rightdex] == 'C'){
                stack.push(current);
                stack.push(rightdex);
                dfs(current, rightdex, grid, visited);
            }
            

            
        }
    }





}
