class SmallestSubArray {


    public static int smallSubArray(int targetSum,int[]nums){

        int windowMinSize = Integer.MAX_VALUE;
        int currentWindowSum=0;
        int windowStart=0;
        for (int windowEnd=0;windowEnd<nums.length;windowEnd++){

              currentWindowSum+=nums[windowEnd];
              while (currentWindowSum>=targetSum){
                  windowMinSize = Math.min(windowMinSize,windowEnd-windowStart+1);
                  currentWindowSum-=nums[windowStart];
                  windowStart++;
              }
        }
        return windowMinSize;
    }

    public static void main(String[] args) {

        SmallestSubArray s = new SmallestSubArray();

        int[]input = new int[]{4,2,2,7,8,1,2,8,10};
        int target=8;
        System.out.println(smallSubArray(target,input));
    }

}
