package sorting;
import java.util.Arrays;

public class InPlaceMergeSort {

    // Function to perform Merge Sort
    static void mergeSort(int[] arr, int left, int right) {
        // Base case: If only one element is left, return
        if (left >= right) {
            return;
        }

        // Step 1: Find the middle index
        int mid = left + (right - left) / 2;

        // Step 2: Recursively sort the left half
        mergeSort(arr, left, mid);

        // Step 3: Recursively sort the right half
        mergeSort(arr, mid + 1, right);

        // Step 4: Merge the two halves in-place
        mergeInPlace(arr, left, mid, right);
    }

    // In-place merge function
    static void mergeInPlace(int[] arr, int left, int mid, int right) {
        int i = left, j = mid + 1;

        // Use a two-pointer technique to merge sorted parts
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                i++; // If already sorted, move left pointer
            } else {
                int temp = arr[j];
                int k = j;

                // Shift elements to the right to make space
                while (k > i) {
                    arr[k] = arr[k - 1];
                    k--;
                }
                arr[i] = temp;

                // Update pointers
                i++;
                mid++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Call In-Place Merge Sort
        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
