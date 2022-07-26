package normal;

import java.util.HashMap;


public class RemovingDuplicates1 {

    public void duplicates(int arr[], int n){

        //HashMap which will store the elements
        //which has appeard previosuly

        HashMap<Integer,Boolean>map = new HashMap<>();

        for (int i=0;i<n;++i){
            //Print the element if it's not their in the HashMap

            if (map.get(arr[i])==null){
                System.out.println(arr[i]+"");

                //Insert the element in the Hashmap
                map.put(arr[i],true);
            }
        }
    }

    public static void main(String[] args) {
        RemovingDuplicates1 rd = new RemovingDuplicates1();
        int[]nums = new int[]{3,6,4,4,8};
        int t = nums.length;
        rd.duplicates(nums,t);
    }
}
