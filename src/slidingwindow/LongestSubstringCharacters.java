package slidingwindow;
//fIND Longest substring DISTINCT CHARACTERS

import java.util.HashSet;

class LongestSubstringCharacters {

    public int lengthOfLongestSubstring(String s) {
        int count=0;
        int i=0;
        int j=0;

        HashSet<Character>set = new HashSet<>();

        while (j<s.length()){

            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                count = Math.max(set.size(),count);
            }else {
                set.remove(s.charAt(i));
                i++;
            }


        }

        return count;

    }



}
