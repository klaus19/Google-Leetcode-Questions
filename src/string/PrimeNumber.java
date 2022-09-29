package string;

public class PrimeNumber {

    public boolean getPrimeNumber(int num){

        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<=num/2;i++)
        {
            if((num%i)==0)
                return  false;
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeNumber ps = new PrimeNumber();
        int n = 23;
        System.out.println(ps.getPrimeNumber(n));
    }
}
