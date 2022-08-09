package DP;

//Given an array of distinct integers nums and a target integer target,
// return the number of possible combinations that add up to target.
public class CombinationSum {

    int dp[];
    public int combinationSum4(int[]nums,int target){

        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++)
            for (int num : nums)
                if (num <= i) dp[i] += dp[i-num];
        return dp[target];
    }
    }


