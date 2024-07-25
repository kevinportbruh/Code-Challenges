import java.math.BigInteger;
import java.util.*;
//@author Kevin Portillo, Self-Proclaimed Code Wizard 🧙‍♂️
public class pizza2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int r = kb.nextInt(); // pizza cms
        int c = kb.nextInt(); // crust cm
        double total = Math.PI * r * r;
        double crust = Math.PI * (r - c) * (r - c);
        double cheese = total - crust;
        System.out.println(100-(cheese / total) * 100);

    }
}