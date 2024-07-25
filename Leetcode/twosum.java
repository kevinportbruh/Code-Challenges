import java.util.HashMap;
//@author Kevin Portillo, Self-Proclaimed Code Wizard 🧙‍♂️
public class twosum {
    HashMap<Integer, Integer> numsMap = new HashMap<Integer, Integer>();// HashMaps for that sweet sweet O(1) look up time 
    HashMap<Integer, Integer> idxMap = new HashMap<Integer, Integer>();
    public int[] twoSum(int[] nums, int target) {
       int temp = 0;
       int idx1=0;
       int idx2 =0;

        for(int i =0;i<nums.length; i++){
            numsMap.put(i, nums[i]);
            idxMap.put(nums[i], i);
            System.out.println(idxMap.get(nums[i]) +" "+ numsMap.get(i));
        }
        
        for (int k: idxMap.values()){
            temp = target - numsMap.get(k); // 2 + 7 =9 9-2 =7
            if(numsMap.containsValue(temp)){
                idx1= idxMap.get(temp);
                if(idx1 != k){
                    idx2 = idxMap.get(nums[k]);
                } 
            }
        }
        int[] ans = {idx1,idx2};
     
        
        return ans;
    }
} 