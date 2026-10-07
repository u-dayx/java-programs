import java.util.Scanner;

public class Class41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        int[] marks = new int[n];

        // 1. Input marks into the array
        System.out.println("Enter marks for " + n + " students:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // 2. Finding Sum, Minimum, and Maximum
        int sum = 0;
        int max = marks[0];
        int min = marks[0];

        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];

            if (marks[i] > max) {
                max = marks[i];
            }
            if (marks[i] < min) {
                min = marks[i];
            }
        }

        double average = (double) sum / n;

        // 3. Count students who scored above average
        int aboveAverageCount = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > average) {
                aboveAverageCount++;
            }
        }

        // 4. Display report
        System.out.println("\n--- Student Marks Report ---");
        System.out.println("Total Students: " + n);
        System.out.println("Total Marks Sum: " + sum);
        System.out.format("Average Marks: %.2f%n", average);
        System.out.println("Highest Marks: " + max);
        System.out.println("Lowest Marks: " + min);
        System.out.println("Scores Above Average: " + aboveAverageCount);

        scanner.close();
    }
}