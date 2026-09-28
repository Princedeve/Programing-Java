package array;

import java.util.Scanner;

public class distinctEleandTwice {
    public static boolean distinctEle(int nums[]){
        int ele = nums[0];
        for(int i = 1; i<nums.length; i++){
            if(ele == nums[i]){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int nums[] = new int[size];

        for(int i = 0; i<size; i++){
            nums[i] = sc.nextInt();
        }
       boolean distinct = distinctEle(nums);
       System.out.println(distinct);
    }
}
