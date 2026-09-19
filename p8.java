import java.util.Scanner;


public class p8 {
    public static void main(String[] args){
     Scanner deg = new Scanner(System.in);
     System.out.println(" Enter  the temperature in degree celsius : ");
     float celsius = deg.nextFloat();
     float fahernheit = ((9/5f)*(celsius ))+( 32);
     System.out.println("the temperature in fahernheit is :  " + fahernheit );
    }
    
    
}
