package slidingwindow;

public class MaxSumSubArray {

    public static int findSumMax(int []nums,int k){

        int maxvalue = Integer.MIN_VALUE;
        int currentRunningSum=0;

         for (int i=0;i<nums.length;i++){
             currentRunningSum+=nums[i];
             if (i>=k-1){
                 maxvalue = Math.max(maxvalue,currentRunningSum);
                 currentRunningSum-=nums[i-(k-1)];
             }
         }
         return maxvalue;
    }

    public static void main(String[] args) {
        System.out.println(findSumMax(new int[]{4,2,1,7,8,1,2,8,1,0},3));
    }
}
