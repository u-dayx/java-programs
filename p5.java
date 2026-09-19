import java.util.Scanner;

public class p5 {
    public static void main(String[] args){
    Scanner circle = new Scanner (System.in);
    System.out.println( "enter the radius of the circle  in cms : ");
    float radius = circle.nextFloat();
    float pi = 3.14f;
    float area = pi * ( radius)*(radius);
    System.out.println( "the area of the circle in cms is : ");
    System.out.println(area);
    }
    
}
