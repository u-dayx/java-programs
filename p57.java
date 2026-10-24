public class p57 {
    public static void main (String[]args){
        int [] arr = {1,3,5,6,7,3,5,6,6,};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;
        for(int i=0;i<n;i++){
            temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;

        }

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }


    }
    
}
