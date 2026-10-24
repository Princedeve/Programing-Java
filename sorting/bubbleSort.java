package sorting;
import java.util.*;

public class bubbleSort {
    public static void bubBleSort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            int swap = 0;
            // boolean swap = false

            for(int j=0; j<arr.length-1-turn; j++){
        // for(int i = 0; i<arr.length; i++){
        //     for(int j = 0; j<arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;//swap = true
                }
            }
            if(swap == 0){
                //!swap
                break;
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        // int arr[] = {5,4,1,3,2}; //O(n2)
        int arr[] = {1,2,3,4,5}; //O(n)

        bubBleSort(arr);
        printArr(arr);
    }
}
