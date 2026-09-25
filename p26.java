import java.util.Scanner;
public class p26 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
       
        while(true){
            System.out.println("Enter the number :");
            int num = sc.nextInt();
            
            if (num<0){
                System.out.println("good bye ");
                break;
            }
            
            num--;
            System.out.println("the numbers in reverse order are : " + num);
        

        }

    
}
}
