public class IsSubsequence {

    //Input: s = "abc", t = "ahbgdc"

    public boolean checkSubsequence(String s,String t){

          int i=0;
          int j=0;

          if (s.isEmpty() && t.isEmpty()){
              return false;
          }

          if(s.length()<=0 && t.length()<=0){
              return false;
        }


          while (i<s.length()){
              if (j>=t.length()){
                  return false;
              }

              if (s.charAt(i)==t.charAt(j)){
                  i++;
                  j++;
              }else {
                  j++;
              }
          }
          return true;

    }

}
