public class ReverseInteger {

    public boolean reverseInteger(int x){
       //if x is less than 0, it's not a Pallindrome nUMBER

        String str = String.valueOf(x);
        String reverseStr = "";

        for(int i= str.length()-1;i>=0;i--){
            reverseStr+=(str.charAt(i));
            if (reverseStr.compareTo(str)==0){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ReverseInteger rs = new ReverseInteger();
        rs.reverseInteger(121);
        System.out.println(rs.reverseInteger(121));
        System.out.println(rs.reverseInteger(345));
    }

}
