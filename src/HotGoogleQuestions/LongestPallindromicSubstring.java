package HotGoogleQuestions;

public class LongestPallindromicSubstring {

    public String findLongestPallindromic(String str){

        //Base case
        if (str.length()==0){
            return null;
        }

        if (str.length()==1){
            return str;
        }

        if (str.length()>1){
            for (int i=1;i<str.length();i++){
                if (str.charAt(i)==str.charAt(0) && str.charAt(i+1)!=str.charAt(0)){
                    return str.;

                }
            }
        }
    }
}
