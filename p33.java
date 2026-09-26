import java.util.Scanner;
public class p33 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        float sum =0;
       
        
        do {
            System.out.println("Enter 1st  number : ");
             float  n1 = sc.nextFloat();
             System.out.println("Enter 2nd  number : ");
             float n2 = sc.nextFloat();
             sum = n1+n2;
             System.out.println("the sum of the numbers is : " + sum);

             System.out.println("if you want to continue press ('y') or ('n') to finish : ");
             char decision = sc.next().charAt(0);
             if (decision=='n'){
                System.out.println("the calculation terminates here ");
                break;

             }



        }while(true);
    
    }
    
}
