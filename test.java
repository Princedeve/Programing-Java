import java.util.*;

public class test {

    public static void reverseArray(int arr[]){
      int first = 0, last = arr.length-1;

      while (first < last) {
        //swap
        int temp = arr[last];
        arr[last] = arr[first];
        arr[first] = temp;
        first++;
        last--;
      }
    }
    public static void main(String args[]){
        
        int numbers[] = {2,4,6,8,10};
        reverseArray(numbers);
        //print
        for(int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        
    }
}