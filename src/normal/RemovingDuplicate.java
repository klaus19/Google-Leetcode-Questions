package normal;

public class RemovingDuplicate {
    public int removeDuplicates(int[] nums) {
        // check if the length of the nums is smaller than 1
        if(nums.length < 1)
            return 0;
        //Declare result or at this problem this variable define
        //The length of checked array for testing because some language can't resize the array
        int result =1;
        //loop inside the nums
        for (int i =0; (i) <nums.length-1; i++){
            //The condition is to check if the current element is eqauls to the next element
            if(nums[i] != nums[i+1]){
                // if condition is true then set the next element to current result slot
                nums[result] = nums[i+1];
                // the add +1 to result
                result++;
            }
        }
        return result;
    }
}
