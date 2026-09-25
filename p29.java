import java.util.Scanner;
public class p29 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int i ;
        do{
            if (n<0){
                System.out.println(" Please enter a positive number : ");
            }
            else {
                System.out.println("Thank you !");
                break;
            }
        
    }while(n>0);
    
}
}
