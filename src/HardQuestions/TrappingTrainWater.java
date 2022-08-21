package HardQuestions;


public class TrappingTrainWater {

    public int trappingWater(int[]height){

        int n = height.length, trippingWaterSum = 0;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = height[0];
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        rightMax[n - 1] = height[n - 1];
        for(int i = n - 2; i >= 0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        for(int i = 0; i < n; i++){
            trippingWaterSum += (Math.min(leftMax[i], rightMax[i]) - height[i]);
        }

        return trippingWaterSum;

    }

    public static void main(String[] args) {
        TrappingTrainWater tps = new TrappingTrainWater();
        int[]arr = new int[]{3,1,2,4,0,1,3,2};
        System.out.println(tps.trappingWater(arr));
    }
}
