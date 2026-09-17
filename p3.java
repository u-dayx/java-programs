import java.util.Scanner;

public class p3 {

    public static void main(String[] args) {

        System.out.println("I am taking input from the user");

        Scanner fahh = new Scanner(System.in);

        System.out.println("Enter the value of a:");
        int a = fahh.nextInt();

        System.out.println("Enter the value of b:");
        int b = fahh.nextInt();

        int sum = a + b;

        System.out.println("The sum of two numbers is:");
        System.out.println(sum);

        fahh.close();
    }
}