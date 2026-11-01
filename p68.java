import java.util.Arrays;

public class p68{ 
    
    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        
        int nonZeroIndex = 0;
        
        // Step 1: Shift non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex++] = nums[i];
            }
        }
        
        // Step 2: Fill the remaining elements with zeros
        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        
        System.out.println("Original Array: " + Arrays.toString(nums));
        
        moveZeroes(nums);
        
        System.out.println("Modified Array: " + Arrays.toString(nums));
    }
}