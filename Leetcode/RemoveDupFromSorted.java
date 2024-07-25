import java.util.*;
//@author Kevin Portillo, Self-Proclaimed Code Wizard 🧙‍♂️
public class RemoveDupFromSorted {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
       
        final int VAL = 3;
        final int ARRLEN = 4;
        int[] bruh = new int[ARRLEN];
        for(int i =0; i<ARRLEN; i++){
            bruh[i] = kb.nextInt();
        }
    }
    
    public int removeDuplicates(int[] nums) {
        //remove dups, scan array into hashmap, if we see dup then set that value to inter.max, keep count, array.sort nums to put the int maxes at the end
        //rule is that we must return the length of array, k with no dups. the first k digits of nums must not have any of the wonky values.
        HashMap<Integer, Boolean> hm= new HashMap<>();
        int counter=0;
        for(int i =0;i<nums.length;i++){
            int key = nums[i];
            if(hm.containsKey(key)){
                nums[i]= Integer.MAX_VALUE;
            }else{
                hm.put(key, true);
                counter++;
            }
        }
        Arrays.sort(nums);
       
        return counter;
    }


}
