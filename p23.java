import java.util.Scanner;
public class p23 {
    public static void main(String[]args){
        int fact =1;
        Scanner q = new Scanner(System.in);
        System.out.println("Enter of how many numbes is to be calculated : ");
        int n = q.nextInt();
        for ( int i=1;i<n;){
         fact = fact *i;
         System.out.println("the factorial of " + i +" is : " + fact );
         i++;
        }


}
}