import java.util.*;
//@author Kevin Portillo, Self-Proclaimed Code Wizard 🧙‍♂️
public class sibice {
    

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int n = kb.nextInt();
        int w = kb.nextInt();
        int h = kb.nextInt();
        //hypotenuse of the box
        double hyp = Math.sqrt(w*w+h*h);

        for(int i =0;i<n;i++){
            int l = kb.nextInt();
            if(l<=w || l<=h || l<=hyp){
                System.out.println("DA");
            }
            else{
                System.out.println("NE");
            }
        }

        
    }
}
