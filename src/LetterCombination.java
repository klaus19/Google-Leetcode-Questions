import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombination {

    public List<String>letterCombination(String digits){
        List<String>res = new ArrayList<>();

        if (digits.equals("")) return res;

        Map<String,String>map = new HashMap<>();

        map.put("1","");
        map.put("2","abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");
        String[]num = digits.split("");
        int n = num.length-1;

        res.add("");

        for (int i = n; i >= 0; i--) {
            List<String> curRes = new ArrayList<>();
            String[] curList = map.get(num[i]).split("");
            for (int j = 0; j < curList.length; j++) {
                for (int k = 0; k < res.size(); k++) {
                    curRes.add(curList[j] + res.get(k));
                }
            }
            res = curRes;
        }
        return res;

    }
}
