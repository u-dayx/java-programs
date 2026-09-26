import java.util.Scanner;
public class p31{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int sum=0;
    

    while(true){
        System.out.println("Enter a number to give the sum : ");
        int num = sc.nextInt();
        
        if (num<0){
            System.out.println("Enter a positive number ");
            continue;

        }
        if (num==0){
            break;
        }
      sum+= num;  
       

    }
    System.out.println("the sum of the numbers is : " + sum );
   
    

}
}