package DP;

public class HouseRobber {

    public int rob(int[]nums){
        int money = nums[0];

        for (int i=1;i<nums.length;i++){
            if (i%2!=0){
                money +=nums[i];
            }

            if (nums.length<=2){
                return nums[i-1];
            }
        }
        return money;
    }

    public static void main(String[] args) {
        HouseRobber hp = new HouseRobber();
        int[]money = new int[]{2,7,9,3,1};
        int[]robber = new int[]{1,1};
        System.out.println(hp.rob(money));
        System.out.println(hp.rob(robber));
    }
}
