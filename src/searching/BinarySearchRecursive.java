package searching;

import java.util.Scanner;

public class BinarySearchRecursive {
    static int binarySearchRecursive(int[] arr, int left, int right, int target) {
        if (left > right) {
            return -1; // Element not found
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid; // Element found
        } else if (arr[mid] < target) {
            return binarySearchRecursive(arr, mid + 1, right, target); // Search in right half
        } else {
            return binarySearchRecursive(arr, left, mid - 1, target); // Search in left half
        }
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

        int result = binarySearchRecursive(arr, 0, size - 1, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }

        in.close();
    }
}
