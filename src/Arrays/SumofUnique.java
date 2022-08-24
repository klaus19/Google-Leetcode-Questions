package Arrays;

import java.util.HashMap;
import java.util.Stack;

public class SumofUnique {

    Stack<Integer>st = new Stack<>();
    public int uniqueElements(int[]nums){
        int first = nums[0];
       for (int i=0;i<nums.length;i++){
           if (nums[i]!=first){
               first+=nums[i];
               st.push(first);
           }else{
              st.pop();
           }
       }
       return first;
    }

    public static void main(String[] args) {
        SumofUnique st = new SumofUnique();
        int[]n = new int[]{1,2,3,2};
        System.out.println(st.uniqueElements(n));
    }
}
