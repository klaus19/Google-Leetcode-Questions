public class LongestCommonSubsequence {


    //Given two strings text1 and text2, return the length of their longest common subsequence.
    // If there is no common subsequence, return 0.

    public int longestCommonSubsequence(String text1, String text2) {
        int[][] map = new int[text1.length() + 1][text2.length() + 1];
        for (int i = 1; i <= text1.length(); i++) {
            for (int j = 1; j <= text2.length(); j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    map[i][j] = 1 + map[i - 1][j - 1];
                } else {
                    map[i][j] = Math.max(map[i - 1][j], map[i][j - 1]);
                }
            }
        }
        return map[text1.length()][text2.length()];
    }
}
