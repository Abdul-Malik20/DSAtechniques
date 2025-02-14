package searching;

import java.util.Scanner;

public class BinarySearchIterative {
    static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;  // Avoids overflow

            if (arr[mid] == target) {
                return mid; // Element found
            } else if (arr[mid] < target) {
                left = mid + 1;  // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = in.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements in sorted order:");
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
