import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[]getTwoSum(int[]arr,int target) {

        Map<Integer, Integer> values = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (values.containsKey(complement)) {
                return new int[]{values.get(complement), i};
            }
            values.put(arr[i], i);
        }
        throw new IllegalArgumentException("No match found");
    }



    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int target = 7;
        int[]nums = new int[]{1,2,5,6};

        System.out.println(ts.getTwoSum(nums,target));
    }
}
