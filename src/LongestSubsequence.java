import java.util.HashMap;
import java.util.Map;

public class LongestSubsequence {

    public int numMatchingSubseq(String s, String[] words) {

        StringBuilder sb = new StringBuilder();
        int count=0;

        Map<String,Integer>seen = new HashMap<>();

        for (String str:words){
            int ind=0;
            boolean clear=true;
            if (seen.containsKey(str)){
                count+=seen.get(str);
                continue;
            }
            if (str.length()>sb.length()){
                continue;
            }
        }



    }
}
