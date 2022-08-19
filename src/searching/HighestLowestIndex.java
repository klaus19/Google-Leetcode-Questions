package searching;

import java.util.HashMap;
import java.util.Map;

public class HighestLowestIndex {

    public int[] searchRange(int[] nums, int target) {

        Map<Integer,Integer>hmp = new HashMap<>();


        for (int i=0;i<nums.length;i++) {
            if (!hmp.containsKey(nums[i] == target)) {
                return new int[]{nums[i], i};
            } else {
                //  hmp.put()
            }
        }
        return nums;
    }
}
