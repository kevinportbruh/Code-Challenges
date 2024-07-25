import java.util.*;
//@author Kevin Portillo, Self-Proclaimed Code Wizard 🧙‍♂️
public class different{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        while(kb.hasNext()){
            
            int m = kb.nextInt();
            int n = kb.nextInt();
            System.out.println(Math.abs(Math.abs(m)-Math.abs(n)));
        }
   
    }
}