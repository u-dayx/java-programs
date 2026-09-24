import java.util.Scanner;
public class p24 {
    public static void main (String[]args){
        Scanner i = new Scanner (System.in);
        System.out.println("Enter a four digit number to reverse it :");
        int num = i.nextInt();
        int digit = 0;
        int revrse = 0;
        int neww ;
        
        while(num>0){
            neww = num%10;
            num = num/10;
            digit = neww;
            revrse = revrse*10+digit;
            
            


            
        }
        System.out.println("The reverse of the entered number is : " + revrse);


    }
    
}
