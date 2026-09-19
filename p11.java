public class p11 {
    public static void main(String[]args){
        int a = 10;
        int b = 30;
        //we are swapping variables without using third varible 
        a = a + b ;

        b = a - b;
        a = a - b;
        System.out.println("The varible 'a' after swapping is : " + a );

        System.out.println("The variable'b' after swapping is : " + b);
        

    }
    
}
