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

    public static int[] reverseArr(int arr[]){
      int n = arr.length-1;
      int copy[] = new int[arr.length];

      for(int i = n; i>=0; i--){
        copy[n-i] = arr[i];
      }
      return copy;
    }
    public static void main(String[] args) {
        
        String arr[] = {"dosa", "chole bhature", "samosa", "fruti"};
        String x = "samosa";

       int array[] = {1,2,6,3,5};

       int num[] = {2,4,6,8,10,12,14};
       int key = 4;
       
       int rev[] = {2,4,6,8,10};

       int copy[] = new int[rev.length-1];

       copy = reverseArr(rev);

       for(int i = 0; i<rev.length; i++){
        rev[i] = copy[i];
       }

       for(int i = 0; i<rev.length; i++){
        System.out.println(rev[i]);
       }
       

    }
}