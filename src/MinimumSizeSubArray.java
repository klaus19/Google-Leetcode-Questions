public class MinimumSizeSubArray {

    public int minimumSubArray(int target,int []nums){

      //define pointers
        int L=0;
        int R=0;

        //min & sum
        int min = Integer.MAX_VALUE,sum=0;
        int n = nums.length;

        //min subarray length
        while (R<n){
            //add the current element
            sum+=nums[R];

            //contract window
            while (target<=sum){
                min = Math.min(min,R-L+1);
                sum-=nums[L];
                L++;
            }
            R++;

        }
        return min==Integer.MAX_VALUE?0:min;



    }
}
