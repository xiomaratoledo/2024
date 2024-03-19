import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        
        System.out.println("Original array: " + Arrays.toString(array));
        
        bubbleSort(array);
        
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
    
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    // Swap elements
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }
}
