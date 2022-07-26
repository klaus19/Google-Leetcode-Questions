package normal;

public class MaximumArray {

    public int compareToMax(int arr[]){

        int currMax,n;
        currMax=arr[0];
        n=arr.length;
        for (int i=1;i<n;i++){
            if (arr[i]>currMax){
                currMax=arr[i];
            }
        }
        return currMax;
    }

    public static void main(String[] args) {
        MaximumArray mt = new MaximumArray();
        int []nums = new int[]{3,4,2,1};
        System.out.println(mt.compareToMax(nums));

    }
}
