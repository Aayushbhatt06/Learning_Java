
import java.util.Arrays;

class LC_62 {

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }
        return f(0, 0, m, n, dp);
    }

    public int f(int i, int j, int m, int n, int[][] dp) {
        if (i == m - 1 && j == n - 1) {
            return 1;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int ans = 0;
        if (i < m - 1) {
            ans += f(i + 1, j, m, n, dp);
        }
        if (j < n - 1) {
            ans += f(i, j + 1, m, n, dp);
        }
        return dp[i][j] = ans;
    }

    //tabulation
    public int uniquePathsTab(int m, int n) {
        if (m == 1 && n == 1) {
            return 1;
        }
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }
        //base case
        // Last row = 1
        for (int j = 0; j < n; j++) {
            dp[m - 1][j] = 1;
        }

        // Last column = 1
        for (int i = 0; i < m; i++) {
            dp[i][n - 1] = 1;
        }
        int ans = 0;
        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                dp[i][j] = dp[i + 1][j] + dp[i][j + 1];
            }
        }
        return dp[0][0];
    }
}
