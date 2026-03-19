import java.util.*;

public class test {
  public static int prefixArray(int arr[]){
    int n = arr.length;

    int prefix[] = new int[n];
    prefix[0] = arr[0];
    int max = prefix[0];
    for(int i = 1; i<n; i++){
      prefix[i] = prefix[i-1] + arr[i];
      if(max < prefix[i]){
        max = prefix[i];
      }
    }
    return max;
  }
  public static void printArray(int arr[]){
    for(int i = 0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
   public static void main(String args[]){
    int arr[] = {1,-2,6,-1,3};
    int prefix = prefixArray(arr);
    System.out.println(prefix);
    // printArray(prefix);
   }
    
}