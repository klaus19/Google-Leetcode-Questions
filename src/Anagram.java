import java.util.Arrays;



//Check if both the strings are anagrams
public class Anagram {

    public boolean getAnagram(String str,String s){

         char[]ch1 = str.toCharArray();
         char[]ch2 = s.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String string1 = new String(ch1);
        String string2 = new String(ch2);

        return string1.contentEquals(string2);
    }

    public static void main(String[] args) {
        Anagram a = new Anagram();
        String s = "LIST";
        String t = "TSLI";

        System.out.println(a.getAnagram(s,t));
    }
}
