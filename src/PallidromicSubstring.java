public class PallidromicSubstring {

    //This is about finding number of Palindromic Substrings in a String

    public int findNumber(String s){

      //Base case

        if (s.length() ==0) return 0;

        int n = s.length();
        boolean [][]dp = new boolean[n][n];
        int res=0;

        //Base case 1 : Length =1 -->true

        for (int i=0;i<n;i++){
            dp[i][i]=true;
            res++;
        }

        //Base case 2 : calculating if char[i] == char[i+1]

        for (int i=0;i<n-1;i++){
            dp[i][i+1]= s.charAt(i)==s.charAt(i+1);
            if (dp[i][i+1]) res++;
        }

        //General case:length>2 -->char[s]==char[e] && dp[i+1][j-1] is true

        for (int len =3;len<=n;len++){
            for ( int i=0, j=i+len-1;j<n;i++,j++){
                dp[i][j] = s.charAt(i)==s.charAt(j) && dp[i+1][j-1];
                if (dp[i][j]) res++;
            }
        }

        return res;
    }

}
