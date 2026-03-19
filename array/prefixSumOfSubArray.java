package array;

public class prefixSumOfSubArray {
    public static void prefixMaxSubArraySum(int arr[]){
        int prefix[] = new int[arr.length];
        int sum = 0;
        int max = 0;
        prefix[0] = arr[0];
        for(int i = 1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                System.out.println(sum);
                if(max < sum){
                    max = sum;
                }
            }
        }
        System.out.println("max sum = "+max);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        prefixMaxSubArraySum(arr);
    }
}
