package normal;

public class ReverseString {

    public String strReverse(String str){

        String rev = "";

       for (int i = str.length()-1;i>=0;--i){
           rev+=str.charAt(i);
       }
       return rev;
    }
}
