import java.util.*;
public class RemoveElementz {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
       
        final int VAL = 3;
        final int ARRLEN = 4;
        int[] bruh = new int[ARRLEN];
        for(int i =0; i<ARRLEN; i++){
            bruh[i] = kb.nextInt();
        }
        removeElement(bruh, VAL);
    }
    
    public static int removeElement(int[] nums, int val) {
        //given int [] remove all instances of val
        // turn into array list, go thru and remove if found
        //turn arraylist back into int array
        Stack st = new Stack<>();
        for(int i = 0; i< nums.length; i++){
            if(nums[i]!=val){
                System.out.println("num to be added to stack "+nums[i]);
                st.push(nums[i]);
            }
        }
        int length = st.size();
        for(int i = 0; i<length; i++){
            nums[i]=(int)st.pop();
        }
        /**
            for(int i: nums){
            System.out.println("final int in nums "+i);
        }
        */
        
        return length;
    }
}
