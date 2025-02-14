package sorting;

import java.util.Arrays;

public class MergeSort {

    // Function to perform Merge Sort
    static void mergeSort(int[] arr, int left, int right) {
        // Base case: If only one element is left, return (already sorted)
        if (left >= right) {
            return;
        }

        // Step 1: Find the middle index
        int mid = left + (right - left) / 2;

        // Step 2: Recursively sort the left half
        mergeSort(arr, left, mid);

        // Step 3: Recursively sort the right half
        mergeSort(arr, mid + 1, right);

        // Step 4: Merge the two sorted halves
        merge(arr, left, mid, right);
    }

    // Function to merge two sorted halves
    static void merge(int[] arr, int left, int mid, int right) {
        // Create temporary arrays for left and right subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        // Merge the sorted arrays back into the main array
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArr[], if any
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArr[], if any
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Call Merge Sort
        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}

