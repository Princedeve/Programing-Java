package array;

public class binarySearch {
    public static int binarySearch(int arr[], int key){
    int start = 0, end = arr.length-1;
    while (start <= end) {
    int mid = start + (end - start) / 2;
    if(arr[mid] == key){
      return mid;
    }
    if(arr[mid] < key){
    start = mid +1;
    }else{
    end = mid - 1;
    }
    }
    return -1; 
    }
 
    public static void main(String args[]){
        
        int numbers[] = {2,4,6,8,10,12,14};
        int index = binarySearch(numbers, 10);
        if(index == -1){
            System.out.println("key is not found: "+index);
        }else{
            System.out.println("Index for key is : "+index);
        }
       
    }
}
