package Arrays;

import java.util.HashMap;
import java.util.Stack;

public class SumofUnique {


    public int uniqueElements(int[]nums){
       HashMap<Integer,Integer>map = new HashMap<>();

       for (int i=0;i<nums.length;i++){
           int s = nums[i];
           map.put(s,map.getOrDefault(s,0)+1);
       }
       int count=0;
       for (int i=0;i<nums.length;i++){
           if(map.get(nums[i])==1)
               count+=nums[i];
       }
       return count;
    }

    public static void main(String[] args) {
        SumofUnique st = new SumofUnique();
        int[]n = new int[]{1,2,3,2};
        System.out.println(st.uniqueElements(n));
    }
}
