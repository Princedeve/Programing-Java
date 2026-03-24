import java.util.*;

public class test {
  public static int target(int arr[], int target){
    for(int i = 0; i<arr.length; i++){
      if(arr[i] == target){
        return i;
      }
    }
    return -1;
  }
   public static void main(String args[]){
    int nums[] = {1};
    int result = target(nums, 0);
    if(result == -1){
      System.out.println(result);
    }else{
      System.out.println("index found at "+ result);
    }
   }    
}