public class p61 {
    public static void main(String[]args){
        int[]arr={44,46,2,5,67,3,26,3,63,21,56,464,45435,2,4};
        int tar = 49;
        boolean isTrue=false;
        for( int i=0;i<arr.length;i++){
            if(tar==arr[i]){
                isTrue=true;
            }

        }
        if(isTrue){
            System.out.println("The element is present in the array ");
        }
        else{
            System.out.println("The element is not present in the array");
        }
    }
    
}
