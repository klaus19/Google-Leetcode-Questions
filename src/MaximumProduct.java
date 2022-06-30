import org.jetbrains.annotations.NotNull;

public class MaximumProduct {

       public int getMax_product(@NotNull int[]arr) {


           int min_product = arr[0];
           int max_product = arr[0];
           int ans = max_product;

           for (int i=1;i<arr.length;i++){
               int tempMax = Math.max(arr[i],Math.max(arr[i]*max_product,arr[i]*min_product));
               min_product = Math.min(arr[i],Math.min(arr[i]*max_product,arr[i]*min_product));
               max_product=tempMax;
               ans = Math.max(max_product,ans);
           }
return ans;
       }

    public static void main(String[] args) {

           MaximumProduct ms = new MaximumProduct();
           int[]arr = new int[]{2,-3,-2,1};
           int[]nums = new int []{4,4,-2,-4};

           System.out.println(ms.getMax_product(arr));
           System.out.println(ms.getMax_product(nums));

    }
}
