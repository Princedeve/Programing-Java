package array;

import java.util.Arrays;

public class checkTwiceOptimise {
    public static void sort(int arr[]){
    for(int i = 0; i < arr.length; i++){
      for(int j = i + 1; j < arr.length; j++){
        if(arr[i] > arr[j]){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }

  public static boolean checkTwiceOptimise(int arr[]){
    // sort(arr);
    Arrays.sort(arr);

    for(int i = 0; i < arr.length - 1; i++){
      if(arr[i] == arr[i+1]){
        return true;
      }
    }
    return false;
  }
 
  public static void main(String args[]){
    int nums[] = {1,2,3,3};

    if(checkTwiceOptimise(nums)){
      System.out.println("true");
    } else {
      System.out.println("false");
    }
  }  
}
