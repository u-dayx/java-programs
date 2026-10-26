public class p59 {
    public static void main (String[]args){
        int[] arr = {1,4,5,6,6,32,63,14,634,6333,78,66,53,74,};
        System.out.println("The elements of array from even indecies are ");
        for (int i =0 ; i<arr.length;i++){
            if (i%2==0){
                System.out.println(arr[i]);
            }
        }
    }
}
