import java.util.Scanner;
public class p22 {
    public static void main (String[]args){
        Scanner yu = new Scanner(System.in);
        System.out.println("Enter a year to check whether it is a leap year or not : ");
        int year = yu.nextInt();
        
        if ((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println("The entered year is leap year" );

        }
        else{
            System.out.println("You entered a non leap year ");
        }
        }
    }
   
