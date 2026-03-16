
public class arrays {
    public static void update(int marks[], int nonChangable){
        nonChangable = 10;
        for(int i = 0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static int LinearSearch(int arr[], int key){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == key){
               return i;
            }
        }
        return -1;
    }
    public static int findMenuIndex(String menu[], String key){
        for(int i = 0; i<menu.length; i++){
            if(menu[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static int findLargest(int arr[]){
        int largest = arr[0];//Integer.MIN_VALUE
        for(int i = 1; i<arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
     public static int findSmallest(int arr[]){
        int smallest = arr[0];//Integer.MAX_VALUE
        for(int i = 1; i<arr.length; i++){
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        return smallest;
    }
    public static int binarySearch(int number[], int key){
    int st = 0, end = number.length-1;
    while (st<=end) {
        int mid = (st+end) / 2;
        
        //comparisons
        if(number[mid] == key){
            return mid;
        }
        if(number[mid] < key){//right
            st = mid+1;
        }else{
            end = mid-1;//left
        }
    }
   return -1;
    }
    public static void reverse(int number[]){
        int first = 0, last = number.length-1;
        while (first < last) {
            //swap
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;

            first++;
            last--;
        }
    }
    public static void pairs(int num[]){
        int tp = 0;
        for(int i = 0; i<num.length; i++){
            for(int j = i+1; j<num.length; j++){
                System.out.print("("+num[i]+","+num[j]+")"+" ");
                tp++;
            }
            System.out.println();
        }
        System.out.print("Total number of pairs : "+tp);
    }
    public static void printSubarrays(int num[]){
        int tp = 0;
         for(int i = 0; i<num.length; i++){
        //    int st = i;
        for(int j = i; j<num.length; j++){
            // int end = j;
            tp++;
            for(int k = i; k<=j; k++){//print
                System.out.print(num[k]+" ");//subarray
            }
            System.out.println();
        }
       }
       System.out.println("Total pairs : "+tp);
    }
    public static void maxSubarraySum(int num[]){
            int currSum = 0;
            int maxSum = num[0];

        for(int i = 0; i<num.length; i++){
            for(int j = i; j<num.length; j++){
                currSum = 0;//after number check restart program
                for(int k = i; k<=j; k++){
                    //subarray sum
                    currSum += num[k];
                }
                System.out.print(currSum+" "); 
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
            System.out.println();
        }

        System.out.println("max sum = "+maxSum);
    }
    public static void maxSubarraySumOptimize(int num[]){// brute force
            int currSum = 0;
            int maxSum = num[0];
            int prefix[] = new int[num.length];

            prefix[0] = num[0];

            for(int i = 1; i<prefix.length; i++){
                prefix[i] = prefix[i-1] + num[i];
            }
            for(int i = 0; i<num.length; i++){
                int start = i;
                for(int j = i; j<num.length; j++){
                    int end = j;
                    currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(maxSum < currSum){
                    maxSum = currSum;
                }    
                }
            }
        System.out.println("max sum = "+maxSum);
    }
    public static void kadanes(int num[]){
        int ms = num[0];
        int cs = 0;

        for(int i = 0; i<num.length; i++){
            if(cs <  0){
                cs = 0;
            }
            cs += num[i];
            if(ms < cs){
                ms = cs;
            }
            // ms = Math.max(ms, cs);
            // System.out.println(cs);
        }
        System.out.println("Maximum sum of subarray: "+ ms);
    }
    public static int trappedRainwater(int height[]){// O(n)
        int n = height.length;
        //calculate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        //calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        int trappedWater = 0;
        //loop 
        for(int i = 0; i<n; i++){
            //waterLevel = min(leftmax bound, rightmax bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            //trapped water = waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
    public static void main(String args []){
        // int marks[] = {97, 98, 99};//passing arrays as a argument by reference
        // int nonChangable = 5;
        // update(marks, nonChangable);
        // System.out.println(nonChangable);
        // for(int i = 0; i<marks.length; i++){
        //     System.out.print(marks[i]+" ");
        // }
        // System.out.println();

        // int arr[] = {2,4,6,8,10,12,14,16};
        // int key = 10;
        // int index = LinearSearch(arr, key);
        // if(index == -1){
        //     System.out.println("NOT found");
        // }else{
        //     System.out.println("key is at index : "+ index);
        // }

        // String menu[] = {"dosa", "chola", "bhature", "samosa"};
        // String key = "samosa";
        // System.out.println(findMenuIndex(menu, key));

        // int arr[] = {1,2,6,3,5};
        // System.out.println("Largest value is : "+findLargest(arr));
        // System.out.println("Smallest value is : "+findSmallest(arr));

        // int number[] = {2, 4, 6, 8, 10 , 12, 14};
        // int key = 10;
        // System.out.println("index for key is : "+binarySearch(number, key));
        // int number[] = {2, 4, 6, 8, 10 , 12, 14};
        // reverse(number);
        // for(int i = 0; i<number.length; i++){
        //     System.out.print(number[i]+" ");
        // }
        // System.out.println();

        // int num[] = {2,4,6,8,10};

        // // pairs(num);
        // printSubarrays(num);
        
        // int num[] = {1,-2,6,-1,3};
   
        // printSubarrays(num);
        // maxSubarraySumOptimize(num);

        // int num[] = {-2,-3,4,-1,-2,1,5,-3};
        // int num[] = {-1,-2,-3,-4};
        // kadanes(num);//max of subarray

        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedRainwater(height));
        
    }
}
