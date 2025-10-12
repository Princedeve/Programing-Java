
public class trapRainWater {
        
    public static void main(String args[]) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Total trapped water: " + trap(height));
    }

    public static int trap(int[] height) {
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            if (height[i] > leftMax[i - 1]) {
                leftMax[i] = height[i];
            } else {
                leftMax[i] = leftMax[i - 1];
            }
        }

        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (height[i] > rightMax[i + 1]) {
                rightMax[i] = height[i];
            } else {
                rightMax[i] = rightMax[i + 1];
            }
        }

        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel;
            if (leftMax[i] < rightMax[i]) {
                waterLevel = leftMax[i];
            } else {
                waterLevel = rightMax[i];
            }

            if (waterLevel > height[i]) {
                trappedWater += waterLevel - height[i];
            }
        }

        return trappedWater;
    }
}