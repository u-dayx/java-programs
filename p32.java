import java.util.Scanner;
public class p32 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  how many numbers of factorial to be calculated : ");
        int N = sc.nextInt();
        int fact = 1;
        for (int i =1 ; i<N;i++){
            fact = fact*i;
            System.out.println("the factorial of " + i + " is : " + fact);
            if (fact>1000000){
                System.out.println("the factorial result is exceeding 1 million ");
                break;
            }
        }
        
    }
    
}
