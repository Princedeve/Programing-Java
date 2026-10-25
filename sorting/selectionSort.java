package sorting;
import java.util.*;
//Pick the smallest element from unsorted array and put it at the beginning
//oposit of bubble sort
public class selectionSort {
    public static void seleCtionSort(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            int minPos = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j] < arr[minPos]){
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArr(int arr[]) {
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2}; //O(n2)
        seleCtionSort(arr);
        printArr(arr);
    }
}
