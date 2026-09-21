import java.util.Scanner;
public class p15 {
    public static void main (String[] args){
        System.out.println("Enter your marks to determine your grade ");
        Scanner ex = new Scanner(System.in);
        float marks = ex.nextFloat();

        if (marks > 90){
            System.out.println("Excellent  your grade is :  A+ ");
        }
        else if (marks>80){
            System.out.println("very good your grade is :  A ");

        }
        else if (marks>60){
            System.out.println("good your grade is : B");

        }
        else if ( marks > 40){
            System.out.println("your grade is : C");

        }
        else if( marks > 35 ){
            System.out.println("pass");

        }
        else{
            System.out.println( "Fail");
        }
    }
    
}
