public class p40 {
    public static void main(String[]args){
        float [] mark = {32.0f,56.88f,69.99f,56.53f,109.54f,45.32f,90.32f,32.0f,99.99f };
        float max=mark[0];
        float min=mark[0];
        for(float element :mark){
            
            if (element>max){
                max=element;
            } 
            if (element<min){
                min=element;
            }    
           
            }
            System.out.println("The maximum value in the array "+max);
            System.out.println("The minimum value in the array "+min);
        }
    
    }    

