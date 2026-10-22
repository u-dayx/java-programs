import java.util.Arrays;

public class p53 {
    public static int findMajorityElement(int[] arr) {
        int candidate = -1;
        int count = 0;

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Verify if the candidate appears more than n/2 times
        int verifyCount = 0;
        for (int num : arr) {
            if (num == candidate) {
                verifyCount++;
            }
        }

        return (verifyCount > arr.length / 2) ? candidate : -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};

        System.out.println("Array: " + Arrays.toString(arr));
        int majority = findMajorityElement(arr);
        if (majority != -1) {
            System.out.println("Majority Element: " + majority);
        } else {
            System.out.println("No Majority Element found");
        }
    }
}