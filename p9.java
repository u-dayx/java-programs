import java.util.Scanner;
public class p9 {
    public static void main(String[]args){
        Scanner time = new Scanner(System.in);
        System.out.println("Enter the total number of minutes");
        int T = time.nextInt(); 
        int  min = (T%60);
        int hour = (T/60);
        System.out.println("The total number of hours is : " + hour);
        System.out.println( " the total number of minutes : "  + min );

    }
    
}
