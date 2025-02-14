package sorting;
import java.util.Arrays;
public class SelectionSort
{
    public static void main(String[] args)
    {
        int[] arr = {20,10,34,3,5,67,56,15};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
    }
    static void selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if (minIndex!=i){
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
