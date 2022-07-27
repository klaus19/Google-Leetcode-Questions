package normal;

public class MaxiProduct {

    public int get_Product(int[]arr,int n){

        int min_product = arr[0];
        int max_product = arr[0];
        int ans = max_product;
        n = arr.length;

        for (int i=1;i<n;i++){
            int temp_Max = Math.max(arr[i],Math.max(arr[i]*max_product,arr[i]*min_product));
            min_product = Math.min(arr[i],Math.min(arr[i]*max_product,arr[i]*min_product));
            max_product = temp_Max;
            ans =Math.max(max_product,ans);

        }
        return ans;
    }

    public static void main(String[] args) {
        MaxiProduct mt = new MaxiProduct();
        int[]srr = new int[]{-2,0,-1};
        int t = srr.length;

        System.out.println( mt.get_Product(srr,t));
    }
}
