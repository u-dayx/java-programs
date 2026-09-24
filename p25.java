import java.util.Scanner;
public class p25 {
    public static void  main(String[]args){
        Scanner u = new Scanner(System.in);
        System.out.println("Enter  how many numbers : ");
        int num = u.nextInt();
        for (int i=1;i<num;i++){
            if (i%10==5){
                continue;
            }
        System.out.println("the numbers are : " + i);
        }

    }
    
}
