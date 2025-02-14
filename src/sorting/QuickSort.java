package sorting;

import java.util.Arrays;

public class QuickSort {

    // Function to perform Quick Sort
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Step 1: Partition the array
            int pivotIndex = partition(arr, low, high);

            // Step 2: Recursively sort left and right parts
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Function to partition the array
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing last element as pivot
        int i = low - 1; // Pointer for smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) { // If current element is smaller than pivot
                i++;
                swap(arr, i, j); // Swap smaller element to the left
            }
        }

        // Place pivot in its correct position
        swap(arr, i + 1, high);
        return i + 1; // Return the pivot index
    }

    // Function to swap elements
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Call Quick Sort
        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
