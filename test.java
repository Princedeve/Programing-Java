import java.util.*;

public class test {
  public static int[] getLeftMax(int arr[]){
    int left[] = new int[arr.length];
    left[0] = arr[0];
    for(int i = 1; i<arr.length; i++){
      if(left[i-1] > arr[i]){
        left[i] = left[i-1];
      }else{
        left[i] = arr[i];
      }
    }
    return left;
  }
  //   public static int[] getRightMax(int arr[]){
  //   
  // }
  public static void trappingRainWater(int arr[]){
    
  } 
   public static void main(String args[]){
    int height[] = {4,2,0,6,3,2,5};
    int left[] = getLeftMax(height);
    for(int i = 0; i<left.length; i++){
      System.out.println(left[i]);
    }
   }    
}