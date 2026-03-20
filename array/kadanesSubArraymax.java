package array;

public class kadane'sSubArraymax {
    public static void kadanesMaxSubArraySum(int arr[]){
    // using kadane's algorithm
    int max = 0;
    int sum = 0;
    for(int i = 0; i<arr.length; i++){
      sum += arr[i];
      if(sum < 0){
        sum = 0;
      }
      if(max < sum){
        max = sum;
      }
    }
    System.out.println("Maximum subarray sum is: "+max);
  }
   public static void main(String args[]){
    int arr[] = {-2,-3,4,-1,-2,1,5,-3};
    maxSubArraySum(arr);
   }     
}
