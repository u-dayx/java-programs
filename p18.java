import java.util.Scanner;
public class p18 {
    public static void main (String[] args){
        Scanner ae = new Scanner (System.in);
        System.out.println("Enter the month number to know its name  (1,2,3,4,5,6,7,8,9,10,11,12 : )");
        int month = ae.nextInt();
        
        switch(month){
            case 1:
                 System.out.println("january");
                 break;
            case 2:
                System.out.println("febraury");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
            case 5:
                System.out.println("may");
                break; 
            case 6:
                System.out.println("june");
                break;       
            
            case 7:
                System.out.println("july");
                break; 
            case 8:
                System.out.println("august");
                break;
            case 9:
                System.out.println("september");
                break;
            case 10:
                System.out.println("october");
                break;
            case 11:
                System.out.println("november");
                break; 
            case 12:
                System.out.println("december");
                break; 
            default: 
                System.out.println("enter a valid month number : ");    
             }

    }
    
}
