package DP;

public class MaxiumumProduct {

    public int maximumProduct(int[]nums){

        int max_ending= nums[0];

        int min_ending = nums[0];

        int max_so_far = nums[0];

        for (int i=1;i<nums.length;i++){
            int temp = Math.max(Math.max(nums[i],nums[i]*max_ending),nums[i]*min_ending);
            min_ending = Math.min(Math.min(nums[i],nums[i]*max_ending),nums[i]*min_ending);
            max_ending=temp;
            max_so_far = Math.max(max_so_far,max_ending);
        }
        return max_so_far;
    }

    public static void main(String[] args) {
        MaxiumumProduct mp = new MaxiumumProduct();
        int[]no = new int[]{2,3,-2,4};
        System.out.println(mp.maximumProduct(no));
    }
}
