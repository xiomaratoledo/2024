import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        
        System.out.println("Original array: " + Arrays.toString(array));
        
        bubbleSort(array);
        
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
    // 5, 2, 9, 1, 5, 6
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        
        do {
            swapped = false; // default / reset the boolean
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) { // compare two elements then swap them
                    // Swap elements
                    int temp = array[i - 1]; // temp is previous element
                    array[i - 1] = array[i]; // change previous element to current
                    array[i] = temp; //change current element to previous
                    swapped = true; // to make loop run
                }
            }
            n--; // use to compare the next two elements
        } while (swapped);
    }
}
