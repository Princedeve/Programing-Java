package array.assigment;
public class trapRainWater{
    public static void trapWater(int height[]){
        int trappedwater = 0;
        int n = height.length;
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = height[0];
        right[n-1] = height[n-1];
        for(int i = 1; i<n; i++){
            if(left[i-1] > height[i]){
                left[i] = left[i-1];
            }else{
                left[i] = height[i];
            }
        }
        for(int i = n-2; i>=0; i--){
            if(right[i+1] > height[i]){
                right[i] = right[i+1];
            }else{
                right[i] = height[i];
            }
        }

        for(int i = 0; i<height.length; i++){
            int wl = 0;
            if(left[i] < right[i]){
                wl = left[i];
            }else{
                wl = right[i];
            }
            if(wl > height[i]){
                trappedwater += wl - height[i];
            }
        }
        System.out.println(trappedwater);
    }
    public static void main(String args[]){
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        trapWater(height);
    }
}