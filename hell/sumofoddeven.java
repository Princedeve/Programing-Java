import java.util.*;
public class sumofoddeven {
public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int oddSum = 0, eveSum = 0;
      for(int i = 0; i<n; i++){
       int ele = sc.nextInt();
       if(ele%2==1){
        oddSum += ele;
       }else{
        eveSum += ele;
       }
      }

      System.out.println("Sum of odd: "+oddSum);
      System.out.println("Sum of even: "+eveSum);

    }
    
}
