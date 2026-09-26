import java.util.*;

import oops.polymorphism;

public class test {
    public static int power(int n, int m){
        int result = 1;
        for(int i = 1; i<=m; i++){
            result *= n;
        }
        return result;
    }
    public static void binaryToDecimal(int n){
        int decimal = 0;
        int power = 0;
        while (n > 0) {
            int digit = n % 10;
            decimal += digit * power(2,power);
            power++;
            n = n / 10;
        }
        System.out.println(decimal);
    }
    public static int binarySearch(int arr[], int key){

        int st = 0;
        int end = arr.length-1;
        while (st <= end) {
        int mid = (st+end)/2;
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid] < key){
                st = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void maxSumOfSubArry(int arr[]){
        int max = 0;
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                sum = 0;
                for(int k = i; k<=j; k++){
                    sum = sum + arr[k];
                }
                System.out.print("("+sum+") ");
                if(max < sum){
                    max = sum;
                }
            }
            System.out.println();
        }
        System.out.println(max);
    }
    public static void prifixSumOfSubArry(int arr[]){
        int prifix[] = new int[arr.length];
        prifix[0] = arr[0];
        int sum = 0;

        for(int i = 1; i<prifix.length; i++){
            prifix[i] = prifix[i-1] + arr[i];
        }
        int max = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                sum =  i==0 ? prifix[j] : prifix[j] - prifix[i-1];
                if(max  < sum){
                    max = sum;
                }
            }
        }
        System.out.println(max);
        
    }
    public static void maxSumOfSubArryKadans(int arr[]){
        int cs = arr[0];
        int ms = arr[0];
        for(int i = 0; i<arr.length; i++){
            cs += arr[i];
            if(ms < cs){
                ms = cs;
            }
            if(cs < 0){
                cs = 0;
            }
        }
        System.out.println(ms);
    }
 public static int maxProduct(int[] nums) {
        int cp = 1;
        int mp = 0;
        for(int i = 0; i<nums.length; i++){
            cp = cp * nums[i];
            if(mp < cp){
                mp = cp;
            }
        }
        return mp;
    }

    public static void trappedRainWater(int height[]){
        int maxLeft[] = new int[height.length];
        int maxRight[] = new int[height.length];
        maxLeft[0] = height[0];
        maxRight[height.length-1] = height[height.length-1];

        for(int i = 1; i<height.length; i++){
            if(maxLeft[i-1] > height[i]){
                maxLeft[i] = maxLeft[i-1];
            }else{
                maxLeft[i] = height[i];
            }
        }
        for(int i = height.length-2; i>=0; i--){
            if(maxRight[i+1] > height[i]  ){
                maxRight[i] = maxRight[i+1];
            }else{
                maxRight[i] = height[i];
            }
        }
        int trappedRainWater = 0;
        for(int i = 0; i<height.length; i++){
            if(maxLeft[i] < maxRight[i]){
                trappedRainWater += (maxLeft[i] - height[i]);
            }else{
                trappedRainWater += (maxRight[i] - height[i]);
            }
        }
        System.out.println(trappedRainWater);
    }
    
    public static void main(String[] args) {
        // for(int i = 2; i%3!=0||i%5!=0; i++){
        //     System.out.println(i+" ");
        // }

        //Fizz Buzz
        // for(int i = 1; i<=30; i++){
        //     if(i%3==0){
        //         System.out.println("fizz ");
        //     }
        //     if(i%5==0){
        //         System.out.println("buzz ");
        //     }
        //     if(i%3!=0&&i%5!=0){
        //         System.out.println(i);
        //     }
        // }
        //optimiz
        // int counter3 = 0, counter5 = 0;
        // for(int i = 1; i<=30; i++){
        //     counter3++; counter5++;

        //     if(counter3 != 3 && counter5!=5){
        //         System.out.println(i+" ");
        //     }else if(counter3 == 3){
        //         System.out.println("fizz");
        //         counter3 = 0;
        //     }
        //     if(counter5 == 5){
        //         System.out.println("buzz");
        //         counter5 = 0;
        //     }
        // }
        // binaryToDecimal(1010);
        // int arr[] = {10, 20, 30, 40, 50, 60};

        // System.out.println(binarySearch(arr, 50));
        // int arr[] = {1,2,3,4,5};
        // for(int i = 0; i<arr.length; i++){
        //     for(int j = i; j<arr.length; j++){
        //         for(int k = i; k<=j; k++){
        //             System.out.print(arr[k]+", ");
        //         }
        //         System.out.println();
        //     }
        // }
        // int arr[] = {1,-2,6,-1,3};
        // maxSumOfSubArry(arr);
        // prifixSumOfSubArry(arr);
        // int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        // int num[] = {-1,-2,-3,-4};
        // maxSumOfSubArryKadans(arr);
        // maxSumOfSubArryKadans(num);
        // int num[] = {0,2};
        // System.out.println(maxProduct(num));
        int height[] = {4,2,0,6,3,2,5};
        trappedRainWater(height);

    }

}