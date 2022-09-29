public class FindIndex {

    int found;
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){

            if(nums[i] == target){
                int temp=i;
                i=temp;
                temp=found;
            }
        }
        return found;
    }
}
