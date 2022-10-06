package string;

import java.util.HashMap;

public class LongestSubstringWithKdistinctCharacters {

  /*
     //Trying to understand hOW getOrDefault used
    public static void get2Values(){
        HashMap<String,Integer>map = new HashMap<>();
        map.put("A",200);
        map.put("B",300);
        map.put("C",400);

        //print map details
        System.out.println("Hashmap:"
                          +map.toString());

        int k = map.getOrDefault("B",600)+1;
        System.out.println(k);
    }
   */

    public int solution(String str, int k) {
        int ans = 0;
        int i = -1;
        int j = -1;
        boolean f1 = false;
        boolean f2 = false;

        HashMap<Character, Integer> hmp = new HashMap<>();

        while (true) {
            while (i < str.length() - 1) {

                f1 = true;
                i++;
                char ch = str.charAt(i);
                hmp.put(ch, hmp.getOrDefault(ch, 0) + 1);

                if (hmp.size() <= k) {
                    int len = i - j;
                    if (len > ans) {
                        ans = len;
                    }
                } else {
                    break;
                }
            }
            while (j < i) {

                f2 = true;
                j++;
                char ch = str.charAt(j);
                if (hmp.get(ch) == 1) {
                    hmp.remove(ch);
                } else {
                    hmp.put(ch, hmp.get(ch) - 1);
                }

                if (hmp.size() > k) {
                    continue;
                } else {
                    int len = i - j;
                    if (len > ans) {
                        ans = len;
                    }
                    break;

                }

            }
            if (f1 == false && f2 == false) {
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LongestSubstringWithKdistinctCharacters ls = new LongestSubstringWithKdistinctCharacters();
        String str = "eebasfd";
        int k = 3;
        System.out.println(ls.solution(str, k));
    }
}