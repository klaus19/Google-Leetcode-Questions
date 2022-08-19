package searching;


// Time cOMPLEXITY o(log n)

//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//
//If target is not found in the array, return [-1, -1].


public class HighestLowestIndex {
    int[]result = new int[2];
    public int[] searchRange(int[] nums, int target) {


        result[0] = startingIndex(nums,target);
        result[1] = endingIndex(nums,target);

       return result;
    }
    private int startingIndex(int[] nums, int target) {
        int index=-1;
        int start=0;
        int end=nums.length-1;

        while (start<=end){
            int mid = start + (end-start)/2 ;
            if (nums[mid]>=target){
                end=mid-1;
            }else{
                start= mid+1;
            }


            if (nums[mid]==target) index=mid;
        }
        return index;
    }

    private int endingIndex(int[] nums, int target) {

        int index=-1;
        int start=0;
        int end=nums.length-1;

        while (start<=end){
            int mid = start + (end-start)/2 ;

            if (nums[mid]<=target){
                start=mid+1;
            }else{
                end=mid-1;
            }

            if (nums[mid]==target) index=mid;
        }

        return index;
    }


}
