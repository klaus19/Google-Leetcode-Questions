public class MaximumSubArray {

    public int maxSubArray(int[]nums){
        int max_sum = nums[0];
        int curr_sum = max_sum;

        for (int i=1;i<nums.length;i++){
            curr_sum = Math.max(nums[i]+curr_sum,nums[i]);
            max_sum = Math.max(curr_sum,max_sum);
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int[]arr = new int[]{1,-3,4,};
        int[]sum = new int[]{1,5,6,-1};
      //  int[]n = new int[]{4,2,1,7,8,1,2,8,1,0};
        MaximumSubArray ms = new MaximumSubArray();
        System.out.println(ms.maxSubArray(arr));
        System.out.println(ms.maxSubArray(sum));

    }
}
