import java.util.Stack;

public class PolishReverseNotation {

    public int evalPRN(String[]tokens){
        Stack<Integer>st = new Stack<>();
        for (String t:tokens){
            if("+-*/".contains(t)){
                st.push(eval(st.pop(),st.pop(),t));
            }else {
                st.push(Integer.parseInt(t));
            }
        }
          return st.pop();
    }

    private int eval(int a,int b,String str) {
        if ("+".equals(str)) {
            return a + b;
        } else if ("-".equals(str)) {
            return a - b;
        } else if ("*".equals(str)) {
            return a * b;
        } else {
            return a / b;
        }
    }

}
