
public class p45 {
    public static void main (String[]args){
        int [] arr = {1,34,56,3,12,57,89,80,79,65,70,34,43};
        int even_n=0;
        int even ;
        int odd_n=0;
        int odd;
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even_n+=1;
                even=arr[i];
                System.out.println("even number is "+even);
            }
            else if (arr[i]%2!=0){
                odd_n+=1;
                odd= arr[i];
                System.out.println("odd number is "+odd);
            }
        }
        System.out.println("Total number of even numbers are "+even_n);
        System.out.println("Total number of odd numbers are"+odd_n);

       
    
}
}