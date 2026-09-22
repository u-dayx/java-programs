import java.util.Scanner;
public class p19 {
    public static void main (String[]args){
        Scanner io = new Scanner(System.in);
        System.out.println("enter the specific operator to calculate  among ('+,-,*,/') :  ");
        char operator_1 = io.next().charAt(0);
        System.out.println("enter the value of 'A' ");
         int  A = io.nextInt();
        System.out.println("enter the value of 'B' ");
         int  B = io.nextInt();
         float  result_1 =0;

        

        switch(operator_1){
            case '+' : 
              result_1= A+B;
              System.out.println("the result after using addition  operator '+' is : " + result_1);
              break;
            case '-':
              result_1 = A-B;
              System.out.println("the result after using subtraction   operator '-' is : " + result_1);
              break;
            case '*':
                result_1 = A*B;
                System.out.println("the result after using multiplication    operator '*' is : " + result_1);
                break;

            case '/':
                if (B != 0) {
                    result_1 = (float) A / B;
                    System.out.println("the result after using division operator '/' is : " + result_1);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default : 
                System.out.println("enter a proper operator  ");

        }
    }
    }

    
