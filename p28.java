import java.util.Scanner;

public class p28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // A secret number between 1 and 100
        int secretNumber = 42; 
        int guess = 0;
        int attempts = 0;

        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");

        // Loop runs as long as the guess is NOT correct
        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++; // Count attempts

            if (guess > secretNumber) {
                System.out.println("Too high! Try again.\n");
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.\n");
            } else {
                System.out.println("Congratulations! You guessed it in " + attempts + " tries!");
            }
        }

        scanner.close();
    }
}