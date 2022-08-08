import java.util.HashSet;

public class LongestSubstring {

    public int lengthOfLongestSubString(String s){
       int i=0;
       int j=0;
       int max=0;

        HashSet<Character>hash_set = new HashSet<>();

        while (j<s.length()){
            if (!hash_set.contains(s.charAt(j))){
                hash_set.add(s.charAt(j));
                j++;
                max = Math.max(hash_set.size(),max);
            }else {
                hash_set.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        LongestSubstring ls = new LongestSubstring();
        String str = "abcabcbb";

        System.out.println(ls.lengthOfLongestSubString(str));
    }
}
