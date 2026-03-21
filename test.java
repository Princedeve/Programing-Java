import java.util.*;

import array.maxSubArraySum;

public class test {
  public static void kadanesMaxSubArraySum(int arr[]){
    // using kadane's algorithm
    int max = arr[0];
    int sum = arr[0];
    for(int i = 0; i<arr.length; i++){
      sum += arr[i];
  
      if(sum > max){
        max = sum;
      }
      
      if(sum < 0){
        sum = 0;
      }
      
    }
    System.out.println("Maximum subarray sum is: "+max);
  }
   public static void main(String args[]){
    int arr[] = {-2,-3,4,-1,-2,1,5,-3};
    int num[] = {-1,-2,-3,-4};
    kadanesMaxSubArraySum(arr);
    kadanesMaxSubArraySum(num);
   }    
}