package normal;

import java.util.LinkedHashSet;


public class RemoveDuplicates2 {

    public static void removeDuplicates(int[]arr){

        LinkedHashSet<Integer>set = new LinkedHashSet<>();

        //adding elemets to LinkeedHashset
        for (int i=0;i<arr.length;i++){
            set.add(arr[i]);

            System.out.println(set);
        }

    }

    public static void main(String[] args) {
        RemoveDuplicates2 rd = new RemoveDuplicates2();
        int[]nums = new int[]{ 1, 2, 5, 1, 7, 2, 4, 2};
        removeDuplicates(nums);
    }
}
