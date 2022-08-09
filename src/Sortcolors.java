public class Sortcolors {


    public void sortColors(int[]nums){
        if (nums.length==0 || nums.length==1)return;

        int start=0;
        int end = nums.length-1;
        int curr_element=0;

        while (curr_element<=end || start<end){
            if (nums[curr_element]==0){
                nums[curr_element] = nums[start];
                nums[start] = 0;
                start++;
                curr_element++;

            } else if (nums[curr_element]==2) {
                nums[curr_element]= nums[end];
                nums[end] =2;
                end--;
            }else {
                curr_element++;
            }
        }
    }
}
