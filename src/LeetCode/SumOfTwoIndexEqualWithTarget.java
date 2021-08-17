package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumOfTwoIndexEqualWithTarget {
    public static void main(String[] args) {
        int[] arr = {3,2,434,52,1,5,4};
        int target = 6;
        int ans[] = twoSum(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] twoSum(int[] nums, int target) {
//        Arrays.sort(nums);
//        int i=0,j=nums.length-1;
//        while(i < j){
//            if(nums[i]+nums[j]==target)
//                return new int[]{i,j};
//            if(nums[i]+nums[j] > target)
//                j--;
//            if(nums[i]+nums[j] < target)
//                i++;
//        }
//        return new int[]{-1};
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){

            if(map.containsKey(target - nums[i]))
                return new int[]{i,map.get(target - nums[i])};
            else
                map.put(nums[i],i);
        }
        return new int[]{};
    }
}

