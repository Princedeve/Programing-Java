package array;

public class checkTwice { // brute force approach
    public static int checkTwice(int nums[]){
   
    for(int i = 0; i<nums.length; i++){
      for(int j = i+1; j<nums.length; j++){
        if(nums[i] == nums[j]){
          return 1;
        }
      }
      
    }
    return -1;
  }

   public static void main(String args[]){

    int nums[] = {1,3,2,4,1};
  
    int result = checkTwice(nums);
    if(result == -1){
      System.out.println("false");
    }else{
      System.out.println("true");
    }
   }   
}
