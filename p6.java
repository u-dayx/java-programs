import java.util.Scanner;
public class p6 { 
    public static void main (String[] args){
     Scanner rectangle = new Scanner(System.in);
     System.out.println("enter the length of the rectangle in cms : ");
     float length = rectangle.nextFloat();
     System.out.println("enter the breadth of the rectangle : ");
     float breadth = rectangle.nextFloat();
     float area = length * breadth ;
     System.out.println("the area of the rectangle in cms  is : " + area);   
    }

    
}

