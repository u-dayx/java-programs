public class p56 {
    public static void main (String[]args){
        int [][] mat1 = {{5,6,7,},{6,2,6}};
        int [][] mat2 = {{1,3,4},{6,2,1}};
        int [][] result = {{0,0,0},{0,0,0}};
        for (int i =0;i<mat1.length;i++){
            for (int j=0;j<mat1[i].length;j++){
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
        }
    }
    

