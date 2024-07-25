import java.util.*;
//@author Kevin Portillo, Self-Proclaimed Code Wizard 🧙‍♂️
public class bubbletea {


    public static class TrashClass {
        int tea; // what tea or the i in princes[i]
        int[]toppings; //k toppings for the drink

        public TrashClass(int tea,  int[] toppings) {
            this.tea = tea;
            this.toppings = toppings;
        }
    }
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] prices = new int[n];
        for(int i=0; i<n; i++){
            prices[i] = kb.nextInt();
        }
        
        int m = kb.nextInt();

        int[] topping = new int[m];
        for(int i=0; i<m; i++){
            topping[i] = kb.nextInt();
        }

        ArrayList<TrashClass> bruh = new ArrayList<TrashClass>();


        for(int i=0; i<n; i++){
            int k = kb.nextInt();
            int[] arr = new int[k];
            for(int j=0; j<k; j++){
                arr[j] = kb.nextInt();
            }
            bruh.add(new TrashClass(i, arr));
            
        }

    

        int money = kb.nextInt();

        //find the cheapest tea/topping combo
        //then find the maximum amount of cups of coffey we could make
        // lets say we have 42 bucks
        //the cheapest drink we wee is $14 we could make 3 and have 0 bucks left, print out 2 drinks as 1 is for us

        //pretty much get the max amount of drinks we can get with the money we have
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            for(int j=0; j<bruh.get(i).toppings.length; j++){//go thru all drinks and their toppings and find the cheapest combo
                min = Math.min(min, prices[i] + topping[bruh.get(i).toppings[j]-1]); // essential min of price of drink and price of topping.
                System.err.println("min "+min + " price of drink "+prices[i] + " price of topping "+topping[bruh.get(i).toppings[j]-1]);
            }
        }
    
        //System.out.println(min);
        //cheapest combo how many drinks can we get
        int cups = (money/min)-1;
        
        System.out.printf("%d\n", cups < 0 ? 0 : cups); // if we have no money we cant buy anything
        


    

    }

}
