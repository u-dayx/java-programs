import java.util.Scanner;
public class p17 {
    public static void main(String[]args){
        Scanner si = new Scanner(System.in);
        System.out.println("Enter the value of 1st number : ");
        int n1 = si.nextInt();
        System.out.println( "Enter the operator which should be performed among ( +,-,*,/): ");
        char operator = si.next().charAt(0);
        System.out.println("Enter the value of 2nd number : ");
        int n2 = si.nextInt();
        float result =0;
        boolean validOperation = true;

        if (operator == '+'){
            result = n1+n2;
        }
        else if (operator == '-'){
            result = n1-n2; 

        }
        else if (operator =='*'){
            result = n1*n2;

        }
        else if (operator =='/'){
            if (n2==0){
                System.out.println("divsion is not possible error n2  cant be zero");
            }
            else{
                 result = n1/n2;
            } }
        else{
                System.out.println("Enter a valid operator ");

            }
        if(validOperation){
            System.out.println("The result after the operation is : " + result );
        }
        



    }
    
}
