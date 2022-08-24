package string;

import java.util.ArrayList;

public class ProductofKLastNumbers {

    ArrayList<Integer>arr;
    int size;

    public ProductofKLastNumbers() {
        arr = new ArrayList<>();


    }

    public void add(int num) {
        arr.add(num);
        size++;
    }

    public int getProduct(int k) {
       int product =1;
       for (int i=1;i<=k;i++){
           product*=arr.get(size-i);
       }
        return product;
    }

}
