import java.util.Scanner;

public class Class48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of both arrays: ");
        int size = scanner.nextInt();

        int[] first = new int[size];
        int[] second = new int[size];
        int[] interleaved = new int[size * 2];

        // 1. Input elements for first array
        System.out.println("Enter elements for first array:");
        for (int i = 0; i < size; i++) {
            System.out.print("first[" + i + "]: ");
            first[i] = scanner.nextInt();
        }

        // 2. Input elements for second array
        System.out.println("\nEnter elements for second array:");
        for (int i = 0; i < size; i++) {
            System.out.print("second[" + i + "]: ");
            second[i] = scanner.nextInt();
        }

        // 3. Interleave (alternate) elements into third array
        int k = 0;
        for (int i = 0; i < size; i++) {
            interleaved[k++] = first[i];
            interleaved[k++] = second[i];
        }

        // 4. Calculate total sum and count even numbers in merged array
        int totalSum = 0;
        int evenCount = 0;
        for (int num : interleaved) {
            totalSum += num;
            if (num % 2 == 0) {
                evenCount++;
            }
        }

        // 5. Display results
        System.out.println("\n--- Interleaved Array Result ---");
        System.out.print("Interleaved Array: ");
        for (int num : interleaved) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Total elements: " + interleaved.length);
        System.out.println("Combined sum: " + totalSum);
        System.out.println("Even numbers count: " + evenCount);

        scanner.close();
    }
}