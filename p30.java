import java.util.Scanner;

public class p30 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it's a palindrome or not : ");
        int number =sc.nextInt();
        int reverse =0;
        int digit =0;
        int original;
        original=number;
        while(number>0){
            digit=number%10;
            
             reverse= reverse*10 +digit;
             number=number/10;
        }
        if(original==reverse){
            System.out.println("The entered number is palindrome");

        }
        else{
            System.out.println("the entered number is not palindrome");
        }
        
        

    }
    
}
