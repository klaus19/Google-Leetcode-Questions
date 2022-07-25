import java.util.Arrays;

public class LongestPrefix {

//    public String[]longestprefix(String str[]){
//      //  str = new String[]{"flip","flow","flam"};
//        Arrays.sort(str);
//        return str;
//    }
//
//    public static void main(String[] args) {
//        LongestPrefix lt = new LongestPrefix();
//        String []st = new String[]{"flip","flow","flam"};
//        System.out.println(Arrays.toString(lt.longestprefix(st)));
//    }

    public String longestCommonPrefix(String[]str){
       if (str.length==0){
           return "";
       }
       String prefix = str[0];
       for (int i=1;i<str.length;i++){
           while (str[i].indexOf(prefix)!=0){
               prefix = prefix.substring(0,prefix.length()-1);
           }
       }
       return prefix;
    }

    public static void main(String[] args) {
        LongestPrefix lp = new LongestPrefix();
        String[]strs = new String[]{"flower", "flow", "flight"};
        System.out.println(lp.longestCommonPrefix(strs));
    }
}
