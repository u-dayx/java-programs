import java.util.Scanner;

public class Class47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of both arrays: ");
        int size = scanner.nextInt();

        int[] array1 = new int[size];
        int[] array2 = new int[size];
        int[] sumArray = new int[size];

        // 1. Input elements for first array
        System.out.println("Enter elements for first array:");
        for (int i = 0; i < size; i++) {
            System.out.print("array1[" + i + "]: ");
            array1[i] = scanner.nextInt();
        }

        // 2. Input elements for second array
        System.out.println("\nEnter elements for second array:");
        for (int i = 0; i < size; i++) {
            System.out.print("array2[" + i + "]: ");
            array2[i] = scanner.nextInt();
        }

        // 3. Add corresponding elements into third array
        for (int i = 0; i < size; i++) {
            sumArray[i] = array1[i] + array2[i];
        }

        // 4. Find the maximum value in the resulting array
        int max = sumArray[0];
        for (int i = 1; i < size; i++) {
            if (sumArray[i] > max) {
                max = sumArray[i];
            }
        }

        // 5. Display all arrays and the result
        System.out.println("\n--- Results ---");
        System.out.print("First Array:  ");
        for (int num : array1) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Second Array: ");
        for (int num : array2) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Sum Array:    ");
        for (int num : sumArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Maximum sum element: " + max);

        scanner.close();
    }
}