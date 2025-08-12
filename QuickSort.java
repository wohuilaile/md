public class QuickSort {
    
    /**
     * Public method to sort an array using quicksort algorithm
     * @param array the array to be sorted
     */
    public static void sort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        quickSort(array, 0, array.length - 1);
    }
    
    /**
     * Recursive quicksort implementation
     * @param array the array to be sorted
     * @param low starting index
     * @param high ending index
     */
    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(array, low, high);
            
            // Recursively sort elements before and after partition
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }
    
    /**
     * Partition method using Lomuto partition scheme
     * @param array the array to be partitioned
     * @param low starting index
     * @param high ending index
     * @return the final position of the pivot element
     */
    private static int partition(int[] array, int low, int high) {
        // Choose the rightmost element as pivot
        int pivot = array[high];
        
        // Index of smaller element (indicates right position of pivot)
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        
        // Place pivot in its correct position
        swap(array, i + 1, high);
        
        return i + 1;
    }
    
    /**
     * Utility method to swap two elements in an array
     * @param array the array containing elements to swap
     * @param i index of first element
     * @param j index of second element
     */
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    /**
     * Utility method to print an array
     * @param array the array to print
     */
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    
    /**
     * Main method to test the quicksort implementation
     * @param args command line arguments
     */
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Original array:");
        printArray(array);
        
        sort(array);
        
        System.out.println("Sorted array:");
        printArray(array);
    }
}