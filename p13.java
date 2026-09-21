import java.util.Scanner;
public class p13 {
    public static void main (String[] args){
        System.out.println("Enter a number to chek wheather it is positive or not");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        if (number > 0) {
            System.out.println("The entered  number is positive ");
        }
        else if(number < 0) {
            System.out.println("The entered nummber is negative");
        }
        else{
            System.out.println("You entered zero");
        }
    
      
    }
}
