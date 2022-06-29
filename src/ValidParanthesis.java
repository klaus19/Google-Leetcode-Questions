import java.util.Stack;

public class ValidParanthesis {

    public boolean isvalid(String s){

        if (s.length()%2!=0) return false;

        Stack<Character>st = new Stack<>();
        for (char c :s.toCharArray()){

            if (c=='('||c=='{'||c=='['){
                st.push(c);
            } else if (c==')' && !st.isEmpty() && st.peek()=='(') {
                st.pop();
            }else if (c=='}' && !st.isEmpty() && st.peek()=='{') {
                st.pop();
            }else if (c==']' && !st.isEmpty() && st.peek()=='[') {
                st.pop();
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        ValidParanthesis vt = new ValidParanthesis();

        String str = "{}[]";
        System.out.println(vt.isvalid(str));
    }
}
