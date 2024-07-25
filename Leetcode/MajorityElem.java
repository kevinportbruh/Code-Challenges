import java.util.*;
//@author Kevin Portillo, Self-Proclaimed Code Wizard 🧙‍♂️
public class MajorityElem {
    public int majorityElement(int[] nums) {
        if(nums.length==0){
            return 0;//base case
        }
        HashMap<Integer, Integer> hm= new HashMap<>(); // <int, int> hash map, first is integer, snd is count of the int
        //go thru count all ints and their occurances, find the one that is appears more than 2/3rds of the time
        for(int i=0;i<nums.length;i++){
            int key = nums[i];
            if(hm.containsKey(key)){
                hm.put(key, hm.get(key)+1); // count occurance of each integer in hashmap (int, int)
            }else{
                hm.put(key, 1);
            }
        }
        //counting done, get max now
        int max =0;
          for(int key : hm.keySet()){
            if (hm.get(key) >nums.length/2){
                max = key;
            }
        }
        return max;
    }
}
