import java.util.*;
//@author Kevin Portillo, Self-Proclaimed Code Wizard 🧙‍♂️
public class RemoveDupFromSorted2 {
    public static void main(String[] args) {
        //debug main first test case on leet code
        // leet code only wants the method, unlike the whole class in kattis
        RemoveDupFromSorted2 solution = new RemoveDupFromSorted2();
        int[] nums = {1,1,1,2,2,3};
        int newLength = solution.removeDuplicates(nums);
        System.out.println("New length: " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
   
    public int removeDuplicates(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        //remove dups, scan array into hashmap, if we see dup then set that value to inter.max, keep count, array.sort nums to put the int maxes at the end
        //may have up to Two dups. So use same hash map but instead of <int, bool> its <int, int> if the count is at 2 then change to Integer.MAX_VAL so that when we Array.sort(nums) the invalid ones are moved to the end
        //This way the first K elems of nums do not have the invalid values.
        HashMap<Integer, Integer> hm= new HashMap<>(); // hashmap for if its been
        int counter=0;
        for(int i =0;i<nums.length;i++){
            int key = nums[i];
            if(hm.containsKey(key)){
                if(hm.get(key) == 2){
                    nums[i]= Integer.MAX_VALUE;
                }else{
                    hm.put(key, hm.get(key)+1);
                    counter++;
                }
                
            }else{
                hm.put(key, 1);
                counter++;
            }
        }
        Arrays.sort(nums);
        /**  debug
        for(int i: nums){
            System.out.println(i); 
        }
        
        */
        return counter;
    }


}
