
class LC_1143 {

    public static void main(String[] args) {

        String s1 = "abcde";
        String s2 = "ace";
        Integer[][] dp = new Integer[s1.length()][s2.length()];
        int a = f(0, 0, s1, s2, dp);
        System.out.println(a);
    }

    public static int f(int i, int j, String s1, String s2, Integer[][] dp) {
        if (i >= s1.length() || j >= s2.length()) {
            return 0;
        }

        if (dp[i][j] != null) {
            return dp[i][j];
        }

        char a = s1.charAt(i);
        char b = s2.charAt(j);

        if (a == b) {
            return dp[i][j] = 1 + f(i + 1, j + 1, s1, s2, dp);
        }
        return dp[i][j] = Math.max(f(i + 1, j, s1, s2, dp), f(i, j + 1, s1, s2, dp));
    }

    public int longestCommonSubsequence_tab(String text1, String text2) {

        int n = text1.length();
        int m = text2.length();

        int[][] dp = new int[n + 1][m + 1];

        // Base case already 0 by default in Java
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {

                if (text1.charAt(i) == text2.charAt(j)) {
                    dp[i][j] = 1 + dp[i + 1][j + 1];
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }

        return dp[0][0];
    }

    public String printLCS(String text1, String text2) {

        int n = text1.length();
        int m = text2.length();

        int[][] dp = new int[n + 1][m + 1];

        // Build DP table
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {

                if (text1.charAt(i) == text2.charAt(j)) {
                    dp[i][j] = 1 + dp[i + 1][j + 1];
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }

        // Reconstruct answer
        int i = 0;
        int j = 0;

        StringBuilder ans = new StringBuilder();

        while (i < n && j < m) {

            // Match
            if (text1.charAt(i) == text2.charAt(j)) {
                ans.append(text1.charAt(i));
                i++;
                j++;
            } // Move in direction of larger value
            else if (dp[i + 1][j] > dp[i][j + 1]) {
                i++;
            } else {
                j++;
            }
        }

        return ans.toString();
    }
}
