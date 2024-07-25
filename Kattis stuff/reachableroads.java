import java.util.*;
//@author Kevin Portillo, Self-Proclaimed Code Wizard 🧙‍♂️
public class reachableroads {
    
    static ArrayList<Integer>[] graph = new ArrayList[1000]; // normal array with array lists
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
      
       int n = kb.nextInt();
        while(n!=0){
            int endpoints = kb.nextInt();
            int numroads = kb.nextInt();
            int[] visited = new int[endpoints];
            for(int i=0;i<endpoints;i++){
                graph[i] = new ArrayList<Integer>();
            }
            //get raod pairs
            for(int i=0;i<numroads;i++){
                int a = kb.nextInt();
                int b = kb.nextInt();
                graph[a].add(b);
                graph[b].add(a);
            }
            //dfs and count the number of connected components?
            int count = 0;
            for (int i =0;i<endpoints;i++){
                if(visited[i] == 0){
                    //System.out.println("dfs at " + i);
                    dfs(i, visited);
                    count++;
                
                }
            }
            //count is the number of connected components
            //min roads to connect them is -1?
            System.out.println(count-1);
            n--;

        }

    }
    //wizardry
    static void dfs(int idx, int[] visited){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(idx);
        while(!stack.isEmpty()){
            int current = stack.pop();
            if(visited[current] == 0){
                //System.out.println("visiting " + current);
                //for each neighbor of current, (in the graph array) push it to the stack
                visited[current] = 1;
                for(int i: graph[current]){
                    //if the neighbor is not visited, push it to the stack
                    if(visited[i] == 0){
                        stack.push(i);
                    }
                }
            }
        }



    }



    
}
