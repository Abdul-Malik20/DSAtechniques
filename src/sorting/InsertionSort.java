package sorting;
import java.util.Arrays;
public class InsertionSort
{
    public static void main(String[] args) {
        int[] arr = {20,10,34,3,5,67,56,15};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
    }
    static  void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }
}
