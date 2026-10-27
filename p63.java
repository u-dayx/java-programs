public class p63 {
    public static void main(String[]args){
          int []arr ={41,35,6,3,2,5,67,2,333,67,75,3,322,564,24,3433};
        int first = arr[0];
        int second = arr[1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<first){
                second = first;
                first = arr[i];
            }
            else if(arr[i]<second && arr[i]!=first){
                second=arr[i];
            }
        }
        System.out.println("The second smallest element in the array "+second);
    }
}
