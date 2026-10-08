import java.util.Scanner;

public class Class44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Input first array
        System.out.print("Enter size of first array: ");
        int n1 = scanner.nextInt();
        int[] first = new int[n1];
        System.out.println("Enter elements for first array:");
        for (int i = 0; i < n1; i++) {
            System.out.print("first[" + i + "]: ");
            first[i] = scanner.nextInt();
        }

        // 2. Input second array
        System.out.print("\nEnter size of second array: ");
        int n2 = scanner.nextInt();
        int[] second = new int[n2];
        System.out.println("Enter elements for second array:");
        for (int i = 0; i < n2; i++) {
            System.out.print("second[" + i + "]: ");
            second[i] = scanner.nextInt();
        }

        // 3. Merge both arrays into a third array
        int[] merged = new int[n1 + n2];
        for (int i = 0; i < n1; i++) {
            merged[i] = first[i];
        }
        for (int i = 0; i < n2; i++) {
            merged[n1 + i] = second[i];
        }

        // 4. Calculate total sum of merged elements
        int totalSum = 0;
        for (int num : merged) {
            totalSum += num;
        }

        // 5. Display merged array and sum
        System.out.println("\n--- Merged Array Result ---");
        System.out.print("Merged Array: ");
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
        System.out.println();
        System.out.println("Total elements count: " + merged.length);
        System.out.println("Sum of all elements: " + totalSum);

        scanner.close();
    }
}