package normal;

public class FizzBuzz {

    public void printBuzz(int arr[]){

        for (int i=0;i<100;i++){
            if (arr[i]%3==0){
                System.out.println("Fizz");
            }else if (arr[i]%5==0){
                System.out.println("Buzz");
            }else if (arr[i]%3==0 && arr[i]%5==0){
                System.out.println("normal.FizzBuzz");
            }
        }

    }

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
       // System.out.println(fb.printBuzz());
    }
}
