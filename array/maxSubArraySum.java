package array;
// Brute force approch is a worst case O(n3)
public class maxSubArraySum {
    public static void maxSubArraySum(int arr[]){
    int max = 0;
    for(int i = 0; i<arr.length; i++){
      for(int j = i; j<arr.length; j++){
        int sum = 0;
        for(int k = i; k<=j; k++){
          sum += arr[k];
          
        }
        System.out.print(sum+" ");
        if(max < sum){
          max = sum;
        }
        System.out.println();
        
      }
    }
    System.out.println("final result of sum of max subarray: "+max);
  }
   public static void main(String args[]){
    int arr[] = {1,-2,6,-1,3};
    maxSubArraySum(arr);
   }
}
