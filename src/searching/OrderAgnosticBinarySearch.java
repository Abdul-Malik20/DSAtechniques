package searching;
import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        // Determine if the array is sorted in ascending or descending order
        boolean isAscending = arr[left] < arr[right];

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Element found
            }

            if (isAscending) {
                if (target < arr[mid]) {
                    right = mid - 1;  // Move left
                } else {
                    left = mid + 1;   // Move right
                }
            } else { // Descending order
                if (target > arr[mid]) {
                    right = mid - 1;  // Move left
                } else {
                    left = mid + 1;   // Move right
                }
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = in.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements in sorted order (ascending or descending):");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("Enter element to search: ");
        int target = in.nextInt();

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }

        in.close();
    }
}
