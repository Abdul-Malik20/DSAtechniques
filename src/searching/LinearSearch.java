package searching;

import java.util.Scanner;

public class LinearSearch {
    // Method to perform linear search
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;  // Return the index where the target is found
            }
        }
        return -1; // Return -1 if the element is not found
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input the array size
        System.out.print("Enter the number of elements: ");
        int size = in.nextInt();

        // Declare and initialize the array
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        // Input the element to search
        System.out.print("Enter the element to search: ");
        int target = in.nextInt();

        // Perform linear search
        int result = linearSearch(arr, target);

        // Output result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

        in.close();
    }
}

