import java.util.Scanner;
public class p35 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
         int current_number=0;
        System.out.println("Enter till how many numbers to check if its a prime number or not");
        int n = sc.nextInt();
        System.out.println("The prime numbers till " +n+" is :");
        for(int i =2; i<n;i++){
            boolean isprime= true;
            for(int j=2 ;j*j<=i;j++){

            
            if(i%j==0){
                isprime=false;
                break;
            }}
            if(isprime){
                System.out.println(i);
            }

    
}
}
}