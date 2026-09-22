import java.util.Scanner;
public class p21 {
    public static void main ( String[]args){
        Scanner t =new Scanner (System.in);
        System.out.println("Enter your salary to calcualte your tax : ");
        float income = t.nextFloat();
        float tax = 0 ;

        if (income<=2.5){
            tax = tax + 0;
        }
        else if (income>2.5 && income<=5){
            tax = tax + 0.05f *(income - 2.5f);
        }
        else if (income>5 && income<=10){
            tax = tax + (0.05f )*(income - 2.5f);
            tax = tax + (0.2f)*(income-5f);

            
        }
        else {
            tax = tax+ 0.05f *(income-2.5f);
            tax = tax + (0.2f)*(income -5f);
            tax = tax + (0.3f)*(income -10.0f);


        }
        System.out.println("tax applied for your income is : " + tax);
    }    
}
