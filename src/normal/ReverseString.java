package normal;

public class ReverseString {

    public String strReverse(String str){

        String rev = "";

       for (int i = str.length()-1;i>=0;--i){
           rev+=str.charAt(i);
       }
       return rev;
    }

    public static void main(String[] args) {
        String s = "Tejas";

        ReverseString rs = new ReverseString();
        System.out.println(rs.strReverse(s));
    }
}
