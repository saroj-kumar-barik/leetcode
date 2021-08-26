package LeetCode;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {2,4,5,6,6,7,8,8,9,11,11,33,44,44};
        int k = removeDuplicate(nums);
        System.out.println(k);
    }

    static int removeDuplicate(int[] nums){
        int j = 0;

        for(int i = 0; i < nums.length-1; i++){
            if (nums[i] != nums[i+1])
                nums[j++] = nums[i];
        }
        nums[j++] = nums[nums.length-1];
        return j;
    }
}
