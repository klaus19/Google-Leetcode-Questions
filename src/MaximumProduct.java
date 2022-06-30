public class MaximumProduct {

       public int getMax_product(int[]arr){

           int ans=arr[0];
           int min_product=ans;
           int max_product=ans;
for (int i=1;i<arr.length;i++){
    if (max_product<0){
        swap(min_product,max_product);
    }

    max_product = Math.max(arr[i],max_product*arr[i]);
    min_product = Math.min(arr[i],min_product*arr[i]);
    ans = Math.max(max_product,ans);

}
           return ans;
}


    private int swap(int min_product, int max_product) {

           int temp;
           temp = min_product;
           min_product=max_product;
           max_product=temp;
           return max_product;
    }

    public static void main(String[] args) {

           MaximumProduct ms = new MaximumProduct();
           int[]arr = new int[]{2,3,-2,1};

           System.out.println(ms.getMax_product(arr));

    }
}
