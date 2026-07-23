package array;
import java.util.*;
public class TwoSum {
    public int[] twoSum(int[] nums, int target){
//        for (int i = 0; i < nums.length - 1; i++){
//            for (int j = i+1; j < nums.length; j++){
//                if (nums[i] + nums[j] == target) return new int[]{i,j};
//            }
//        }
//        return null;
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            numsMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++){
            if (numsMap.containsKey(target - nums[i]) && i != numsMap.get(nums[i])) {
                return new int[]{i, numsMap.get(target - nums[i])};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 6, 11, 15};
        int target = 8;
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(nums, target)));
    }
}