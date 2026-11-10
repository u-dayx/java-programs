import java.util.Arrays;

public class p74 {
    
    public static void reverseArray(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            // Swap elements at the left and right pointers
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            
            // Move pointers towards the center
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        
        System.out.println("Original Array: " + Arrays.toString(nums));
        
        reverseArray(nums);
        
        System.out.println("Reversed Array: " + Arrays.toString(nums));
    }
}
