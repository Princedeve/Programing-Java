import java.util.*;

import array.linearSearch; 

public class test {
    public static int linearSearch(int num[], int key) {

          for(int i = 0; i<num.length; i++){
            if(num[i] == key){
               return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        
        int arr[] = {2,4,6,8,10,12,14,16};
        int x = 10;

        int index = linearSearch(arr, x);

        if(index == -1){
            System.out.println("Not found");
        }else{
            System.out.println("key is at index: "+index);
        }
    }
}