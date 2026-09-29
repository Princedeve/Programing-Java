package array;

import java.util.*;

public class target {
    public static void insertionSort(int nums[]){
        for(int i = 1; i<nums.length; i++){
            int key = nums[i];//5
            int j = i-1;//0
            while (j>=0 && nums[j] > key) {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
    }

    public static int binarySearch(int nums[], int target){
        insertionSort(nums);
        int st = 0, end = nums.length-1;
        while (st<=end) {
            int mid = (st+end)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                st = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        System.out.println(binarySearch(nums, 0));
    }
}
