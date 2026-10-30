public class p66 {
    public static void main(String args[]){
        int [] arr = {2,4,5,7,3,6,7,3,2,5,7,5,2,6,7,8};
        int l=arr.length;
        int temp;
        System.out.println("The reverse order of an array is");
        int n = Math.floorDiv(l,2);
        for (int i=0;i<n;i++){
            temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
            System.out.print(arr[i]+" ");
        }
        
     }
    
}
