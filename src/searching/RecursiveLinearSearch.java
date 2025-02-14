package searching;

import java.util.Scanner;

public class RecursiveLinearSearch {
    // Recursive method for linear search
    static int linearSearch(int[] arr, int index, int target) {
        // Base case: if index is out of bounds
        if (index >= arr.length) {
            return -1;
        }
        // If the element is found, return the index
        if (arr[index] == target) {
            return index;
        }
        // Recursive call for the next index
        return linearSearch(arr, index + 1, target);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = in.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("Enter element to search: ");
        int target = in.nextInt();

        // Call recursive function starting from index 0
        int result = linearSearch(arr, 0, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }

        in.close();
    }
}
