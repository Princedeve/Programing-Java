import java.util.*;

import array.linearSearch;
import oops.encapsulation; 

public class test {
    public static int linearSearch(String num[], String key) {

          for(int i = 0; i<num.length; i++){
            if(num[i] == key){
               return i;
            }
        }

        return -1;
    }

    public static int largest(int arr[]){
        int num = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(num < arr[i]){
                int temp = num;
                num = arr[i];
                arr[i] = temp;
            }
        }

        return num;
        
    } 
    public static int binarySearch(int arr[], int key){
        int mid;
        int st = 0;
        int end = arr.length-1;
        for(int i = st; i<=end; i++){
            mid = (st+end) / 2;
            if(arr[mid] == key ){
                return mid;
            }else if(arr[mid] < key){
                st = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static int binarySearchWhile(int arr[], int key){
        int mid;
        int st = 0;
        int end = arr.length-1;
        while(st <= end){
            mid = (st+end) / 2;
            if(arr[mid] == key ){
                return mid;
            }else if(arr[mid] < key){
                st = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void reverseArr(int arr[]){
        int first = 0, last = arr.length-1;
        while(first < last){
            //swap
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }

        // for(; first<last; first++,last--){
        //     //swap
        //     int temp = arr[last];
        //     arr[last] = arr[first];
        //     arr[first] = temp;
        // }

    }

    public static void pairsArry(int arr[]){
        int tp = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                System.out.print(arr[i]+","+arr[j]+" ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total number of pairs is :"+tp);
    }

public static void printsumofSubarr(int arr[]) {
    int totalSub = 0;

    int min = arr[0];
    int max = arr[0];

    for (int i = 0; i < arr.length; i++) {

        for (int j = i; j < arr.length; j++) {

            int sumOfSubArry = 0;

            for (int k = i; k <= j; k++) {
                sumOfSubArry += arr[k];
                System.out.print(arr[k] + " ");
            }

            System.out.print("sum " + sumOfSubArry + ", ");

            // Find minimum sum
            if (sumOfSubArry < min) {
                min = sumOfSubArry;
            }

            // Find maximum sum
            if (sumOfSubArry > max) {
                max = sumOfSubArry;
            }

            totalSub++;
            System.out.println();
        }

        System.out.println();
    }

    System.out.println("Minimum of subarray: " + min);
    System.out.println("Maximum of subarray: " + max);
    System.out.println("Total Sub Array: " + totalSub);
}

    public static void printSubArry(int arr[]){
       int totalSub = 0;
     
       for(int i = 0; i<arr.length; i++){
        int min = arr[i];
       int max = arr[i];
           for(int j = i; j<arr.length; j++){
                int sumOfSubArry = 0;
                for(int k = i; k<=j; k++){
                    sumOfSubArry += arr[k];
                    System.out.print(arr[k]+" ");
                    
                }
                System.out.print("sum "+sumOfSubArry+", ");
                //find minimum sum
                if(sumOfSubArry < min){
                    min = sumOfSubArry;
                }
                //find maximum sum
                if(sumOfSubArry > max){
                    max = sumOfSubArry;
                }
       
                totalSub++;
                System.out.println();
            }
            System.out.println("minimum of subarry: "+ min+" ");
            System.out.println("maximum of subarry: "+ max+" ");

            System.out.println();
        }
        System.out.println("total Sub Array: "+totalSub);

    }

    public static void main(String[] args) {
        
    String arr[] = {"dosa", "chole bhature", "samosa", "fruti"};
    String x = "samosa";

       int array[] = {1,2,6,3,5};

       int num[] = {2,4,6,8,10,12,14};
       int key = 4;
       
       int arry[] = {2,4,6,8,10};

    //    reverseArr(arry);

    //    for(int i = 0; i<arry.length; i++){
    //     System.out.println(arry[i]);
    //    }
    //    pairsArry(arry);

    // printSubArry(arry);
    // printsumofSubarr(arry);
    }
}