package array;

public class trappingRainWater {
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
    public static int[] getRightMax(int arr[]){
      int n = arr.length;
      int right[] = new int[n];
      right[n-1] = arr[n-1];
      for(int i = n-2; i>=0; i--){
        if(right[i+1] > arr[i]){
          right[i] = right[i+1];
        }else{
          right[i] = arr[i];
        }
      }
    
    return right;
  }
  public static void trappingRainWater(int arr[]){
      int tw = 0;
      int left[] = getLeftMax(arr);
      int right[] = getRightMax(arr);
      for(int h = 0; h<arr.length; h++){
        int wl = 0;
      if(left[h] < right[h]){
        wl = left[h];
      }else{
        wl = right[h];
      }
      if(wl > arr[h]){ // 5>6 = false for no added -1
        tw += (wl - arr[h])*1;
      }
    }
    System.out.println("total trapped water is : "+ tw);
  } 
   public static void main(String args[]){
    int height[] = {4,2,0,6,3,2,5};
    trappingRainWater(height);
   }    
}
