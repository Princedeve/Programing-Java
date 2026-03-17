package array;

public class findLargest {
      public static int findLargest(int arr[]){
        int num = arr[0];//Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > num){
                num = arr[i];
            }
        }
        return num;
    }
        public static int findSmallest(int arr[]){
        int num = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < num){
                num = arr[i];
            }
        }
        return num;
    }
    public static void main(String args[]){
        
        int arr[] = {1,2,6,3,5};
        int largest = findLargest(arr);
        int smallest = findSmallest(arr);
        System.out.println("Largest number of array is : "+largest);
        System.out.println("Smallest number of array is : "+smallest);
    }
}