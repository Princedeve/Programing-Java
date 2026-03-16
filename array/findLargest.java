package array;

public class findLargest {
      public static int findLargest(int arr[]){
        int num = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > num){
                num = arr[i];
            }
        }
        return num;
    }
    public static void main(String args[]){
        
        int arr[] = {1,2,6,3,5};
        int largest = findLargest(arr);
        System.out.println("largest number of array is : "+largest);
    }
}