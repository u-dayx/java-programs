import java.util.Scanner;
public class p20 {
    public static void main (String[] args){
        Scanner po = new Scanner(System.in);
        System.out.println("Enter the amoumt of elecricity units consumed ");
        float units = po.nextFloat();
        int category = (int) (units/100);
        float bill = 0;


        switch(category){
            case 0 :
                bill = units*2;
                System.out.println("Your payable  electricity bill amount  is : " + bill);
                break;
            case 1 :
                bill = units*3;
                System.out.println("Your payable  electricity bill amount  is : " + bill);
                break;
            case 2:
                bill = units*4;
                System.out.println("Your payable  electricity bill amount  is : " + bill);
                break;
            case 3:
                bill = units*8;
                System.out.println("Your payable  electricity bill amount  is : " + bill);
                break;
        }
            
                
        }


 
    }

