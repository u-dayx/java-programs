public class p67 {
    
    // Method to rotate the array to the left by one position
    public static void rotateLeftByOne(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // No rotation needed for empty or single-element arrays
        }
        
        int firstElement = arr[0]; // Store the first element
        
        // Shift elements to the left
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        
        // Move the first element to the last position
        arr[arr.length - 1] = firstElement;
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        
        System.out.print("Original Array: ");
        printArray(originalArray);
        
        // Perform rotation
        rotateLeftByOne(originalArray);
        
        System.out.print("Array after Left Rotation by One: ");
        printArray(originalArray);
    }
    
    // Helper method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}