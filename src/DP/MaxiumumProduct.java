package DP;

public class MaxiumumProduct {

    public int maximumProduct(int[]nums){

        int max= nums[0];
        int curr = max;

        for (int i=1;i<nums.length;i++){
            max = Math.max(max*nums[i],max);
            curr = Math.max(curr,max);
        }
        return curr;
    }

    public static void main(String[] args) {
        MaxiumumProduct mp = new MaxiumumProduct();
        int[]no = new int[]{2,3,-2,4};
        System.out.println(mp.maximumProduct(no));
    }
}
