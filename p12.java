import java.util.Scanner;
public class p12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height in meters : " );
        float height = sc.nextFloat();
        System.out.println("Enter your weight in kgs : ");
        float weight = sc.nextFloat();
        float BMI = (weight) /(height*height);
        System.out.println("Your BMI score is : " + BMI );
    

       
    
    }
}