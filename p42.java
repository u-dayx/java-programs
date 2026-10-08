import java.util.Scanner;

public class Class42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        // 1. Read elements into array
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        // 2. Count even and odd numbers
        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < size; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // 3. Reverse the array
        int[] reversed = new int[size];
        for (int i = 0; i < size; i++) {
            reversed[i] = numbers[size - 1 - i];
        }

        // 4. Linear search for a specific value
        System.out.print("\nEnter a number to search: ");
        int target = scanner.nextInt();
        int foundIndex = -1;

        for (int i = 0; i < size; i++) {
            if (numbers[i] == target) {
                foundIndex = i;
                break;
            }
        }

        // 5. Display results
        System.out.println("\n--- Results ---");
        System.out.print("Reversed Array: ");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
        System.out.println("\nEven numbers: " + evenCount + ", Odd numbers: " + oddCount);

        if (foundIndex != -1) {
            System.out.println(target + " found at index: " + foundIndex);
        } else {
            System.out.println(target + " not found in array.");
        }

        scanner.close();
    }
}