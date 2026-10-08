import java.util.Scanner;

public class Class43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        // 1. Take input from user
        System.out.println("Enter " + size + " integer values:");
        for (int i = 0; i < size; i++) {
            System.out.print("Index " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        // 2. Count positive, negative, and zero numbers
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] > 0) {
                positiveCount++;
            } else if (arr[i] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        // 3. Check if the array is a palindrome
        boolean isPalindrome = true;
        for (int i = 0; i < size / 2; i++) {
            if (arr[i] != arr[size - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        // 4. Display results
        System.out.println("\n--- Analysis Results ---");
        System.out.println("Positive numbers count: " + positiveCount);
        System.out.println("Negative numbers count: " + negativeCount);
        System.out.println("Zero count: " + zeroCount);

        if (isPalindrome) {
            System.out.println("The array is a PALINDROME.");
        } else {
            System.out.println("The array is NOT a palindrome.");
        }

        scanner.close();
    }
}