package array;
public class{
     public static void subArray(int arr[]){
    int tp = 0;
    for(int i = 0; i<arr.length; i++){
      for(int j = i; j<arr.length; j++){  
        for(int k = i; k<=j; k++){
          System.out.println(arr[k]+" ");
        }
        tp++;
        System.out.println();
      }
      System.out.println();
    }
    System.out.println("Total number or subArray is: "+ tp );
  }
    public static void main(String args[]){
      int arr[] = {2,4,6,8,10};
      subArray(arr);
        
    }
}