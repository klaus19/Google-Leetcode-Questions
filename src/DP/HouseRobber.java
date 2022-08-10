package DP;

//House of Robber
//Given an integer array nums representing the amount of money of each house,
// return the maximum amount of money you can rob tonight without alerting the police.

//Time complexity
public class HouseRobber {

    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
         int dp[] = new int[nums.length];
        dp[0] =nums[0];
         dp[1] = Math.max(nums[0],nums[1]);

         for (int i=2;i<dp.length;i++){
             dp[i] = Math.max(nums[i]+dp[i-2],dp[i-1]);

         }
         return dp[nums.length-1];
    }


    public static void main(String[] args) {
        HouseRobber hp = new HouseRobber();
        int[]money = new int[]{2,7,9,3,1};
        int[]robber = new int[]{1,1};
        System.out.println(hp.rob(money));
        System.out.println(hp.rob(robber));
    }
}
