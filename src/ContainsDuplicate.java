import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {

    //using hashMap
    public boolean containsDuplicate(int[]nums){

        HashMap<Integer,Integer>map = new HashMap<>();
        for (int i:nums){
            if (map.containsKey(i)) return true;
            map.put(i,i);
            }

        return false;
    }

    // second method with Time complexity of O(n*n)
    public boolean duplicate(int[]arr){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    //Using HashSet
    public boolean usingHashset(int[]nums){
        HashSet<Integer>set = new HashSet<>();
        for (int i=0;i<nums.length;i++){
            if (set.contains(nums[i])) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate c = new ContainsDuplicate();
        int[]arr = new int[]{1,2,3};
        System.out.println(c.containsDuplicate(arr)); //using brute force method
        System.out.println(c.duplicate(arr)); //using HashMap
        System.out.println(c.usingHashset(arr)); //Using Hashset

    }
}
