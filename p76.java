import java.util.Arrays;

public class p76 {
    
    public static int maxSubArraySum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int maxSoFar = nums[0];
        int currentMax = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        
        System.out.println("Array: " + Arrays.toString(nums));
        
        int maxSum = maxSubArraySum(nums);
        
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}