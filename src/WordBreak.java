import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WordBreak {

    HashMap<String,Boolean>memo = new HashMap<>();

    public boolean wordBreak(String s, List<String>wordsList){

        if (memo.containsKey(s)){
            return memo.get(s);
        }

        if (s==""){
            return true;
        }

        for (var option:wordsList){
            if (s.startsWith(option)&&wordBreak(s.substring(option.length()),wordsList)){
                memo.put(s,true);
                return true;
            }
        }

        memo.put(s,false);
        return false;

    }


}
