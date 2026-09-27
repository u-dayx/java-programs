//armstrong number =  if the sum of the cubes of its digits equals the number itself 

import java.util.Scanner;

public class p34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // --- Core Task: Check a single input number ---
        System.out.print("Enter a 3-digit number to check: ");
        int number = scanner.nextInt();
        
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number!");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }
        
        // --- Bonus Task: Print all Armstrong numbers between 100 and 999 ---
        System.out.println("\nArmstrong numbers between 100 and 999:");
        for (int i = 100; i <= 999; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        
        scanner.close();
    }
    
    /**
     * Helper method to check if a number is an Armstrong number using a while loop.
     */
    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        
        // Extract digits and sum their cubes using a while loop
        while (num > 0) {
            int digit = num % 10;          // Extract the last digit
            sum += digit * digit * digit;  // Add the cube of the digit to the sum
            num /= 10;                     // Remove the last digit
        }
        
        return sum == original;
    }
}