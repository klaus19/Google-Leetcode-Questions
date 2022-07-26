package normal;

public class ReverseString {

    public String strReverse(String str){

        String rev = "";

       for (int i = str.length()-1;i>=0;--i){
           rev+=str.charAt(i);
       }
       return rev;
    }

    //Better option

    public  String reverse(String in){
        int len = in.length();
        StringBuilder sb = new StringBuilder(len);

        for (int i=len-1;i>=0;--i){
            sb.append(in.charAt(i));
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String s = "Tejas";
        String st = "mat";

        ReverseString rs = new ReverseString();
        System.out.println(rs.strReverse(s));

        System.out.println(rs.reverse(st));
    }
}
