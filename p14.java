import java.util.Scanner;
public class p14 {
    public static void main (String[] args){
         System.out.println("enter a number to check whether it is a even or odd");
        Scanner sa = new Scanner(System.in);
        int check = sa.nextInt();
        check=check%2;
        if (check==0){
            System.out.println("YOu entered a even number");
        }
        else{
            System.out.println("YOu entered a negative number");
        }
       
    }
    
}
