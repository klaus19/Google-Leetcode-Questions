import java.util.HashMap;

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

    public static void main(String[] args) {
        ContainsDuplicate c = new ContainsDuplicate();
        int[]arr = new int[]{1,2,3};
        System.out.println(c.duplicate(arr));
    }
}
