package sorting;

import java.util.Arrays;

public class CyclicSort
{
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        cyclicSort(arr);
    }
    static void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
