import java.util.Scanner;
public class p34{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Try to enter an armstrong number : ");
        int number = sc.nextInt();
        int original ;
        int digit=0;
        int arms =0;
        int current_num=0;
        int digit_1=0;
        int arms_1=0;
        int temp=0;





        original = number;
        while (number>0){
            digit= number%10;
            arms=(arms)+digit*digit*digit;
            number=number/10;
        }
         
            if(arms==original){
            
                System.out.println("The entered number is armstrong number!! " );

            }
            else {
                System.out.println("The entered number is not armstrong number   please try again! ");
            }
            System.out.println("The armstrong numbers from 100 to 999 are : ");
        for (int i=100;i<999;i++){
            current_num=i;
            temp=i;
            arms_1=0;
            while(temp>0){
                digit_1=temp%10;
                arms_1= (arms_1)+(digit_1*digit_1*digit_1);
                temp=temp/10;

            }
            
         if(arms_1==current_num){
                    System.out.println(  arms_1);

                }

            
        }
         

    }
}