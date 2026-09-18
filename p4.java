import java.util.Scanner;
public class p4 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the marks of first subject out of 80 : ");
        int sub_1 = sc.nextInt();
        System.out.println("enter the marks of subject 2 out of 80  : ");
        int sub_2 = sc.nextInt();
        System.out.println("enter the marks of subject 3  out of 80 : ");
        int sub_3 = sc.nextInt();
        System.out.println("enter the marks of subject 4 out of 80: ");

        int sub_4 = sc.nextInt();

        int Total;
        Total = sub_1 + sub_2 + sub_3 + sub_4 ;
        float  percentage = (Total/320.00f)*100;
        System.out.println("The percentage is");
      System.out.println(percentage)//        
    }
}
