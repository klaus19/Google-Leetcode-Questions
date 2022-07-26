package normal;

public class NestedParantheses {

    public static boolean checkNesting(String s){
        int count=0;
        for (int i=0;i<s.length();++i){
            char ch = s.charAt(i);
            if (ch == '('){
                ++count;
            } else if (ch==')') {
                --count;
                if (count<0)return false;
            }
        }
        return count==0;
    }

    public static void main(String[] args) {
        NestedParantheses nt = new NestedParantheses();
        String st = "()()";
        String s= "((())";
        System.out.println(checkNesting(st));
        System.out.println(checkNesting(s));
    }
}
