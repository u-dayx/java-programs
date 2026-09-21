import java.util.Scanner;
public class p16 {
    public static void main (String[] args){
        Scanner ch = new Scanner(System.in);
        System.out.println("Enter value of a ");
        int a = ch.nextInt();
        System.out.println("Enter  value of b");
        int b = ch.nextInt();
        System.out.println("Enter  value of c");
        int c = ch.nextInt();
        
        if ( a>b && a>c){
            System.out.println( " 'a' is greatest number");

        }
        else if ( b>a && b>c){
            System.out.println( "'b' is the greatest number ");
        }
        else {
            System.out.println("'c' is the greatest number ");
        }
    
    }
    
}
