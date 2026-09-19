import java.util.Scanner;
public class p7 {
    public static void main (String[] args){
    Scanner  si = new Scanner(System.in);
    System.out.println("Enter the principle amount: ");
    float principle = si.nextFloat();
    System.out.println(" enter the time in months : ");
    float time = si.nextFloat();
    System.out.println("enter the intrest rate ; ");
    float rate = si.nextFloat();

    float simple_inrest = (principle * time * rate ) / 100 ;
    System.out.println(" the simple intrest of the given principle amount is : " + simple_inrest);

    
}
}