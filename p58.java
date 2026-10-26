public class p58 {
    public static void main (String[]args){
        int [] arr = {4,2,5,7,7,3,2,5,7,9,2,4,56,6,8,9,4,2,1,545,8,9,4,22};
        int odd =0;
        int even=0;
        for(int ele : arr){
            if (ele%2==0){
                even+=1;
            }
            else{
                odd+=1;
            }

      }
      System.out.println("The total number of odd numbers are "+ odd);
      System.out.println("The total number of even numbers are "+ even);
    }
    
}
