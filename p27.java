import java.util.Scanner;

public class p27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter ending number: ");
        int end = scanner.nextInt();

        System.out.println("\nPrime numbers between " + start + " and " + end + ":");

        // Outer loop: iterate through each number in the range
        for (int num = start; num <= end; num++) {
            if (num > 1) {
                boolean isPrime = true;

                // Inner loop: check if 'num' has any factor up to sqrt(num)
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break; // Stop checking as soon as a factor is found
                    }
                }

                if (isPrime) {
                    System.out.print(num + " ");
                }
            }
        }

        System.out.println();
        scanner.close();
    }
}