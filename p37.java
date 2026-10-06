import java.util.Scanner;
public class p37 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which table has to be calculated ");
        int n = sc.nextInt();
        int i=10;
        int value;
        int sum=0;
        while(i>=1){
            value = (n*i);
            System.out.println(n+"x"+i+"="+value);
            sum=sum+value;
            i--;
            
        }
        System.out.println("The sum of the all multiplied numbers is : "+ sum);



        
 
   
  



}
    
}
