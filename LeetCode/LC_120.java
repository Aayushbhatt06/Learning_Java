import java.util.List;

public class LC_120 {
    Integer[][] dp;

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        dp = new Integer[n][n];
        return helper(triangle, 0, 0);
    }

    private int helper(List<List<Integer>> triangle, int row, int col) {
        if (row == triangle.size() - 1) {
            return triangle.get(row).get(col);
        }

        if (dp[row][col] != null) {
            return dp[row][col];
        }

        int down = helper(triangle, row + 1, col);
        int diagonal = helper(triangle, row + 1, col + 1);

        return dp[row][col] =
            triangle.get(row).get(col) + Math.min(down, diagonal);
    }

    // Tabulation code
    
    public int minimumTotalTab(List<List<Integer>> triangle) {
        int n = triangle.size();
        dp = new Integer[n][n];

        for (int i = 0; i < n; i++) {
            dp[n - 1][i] = triangle.get(n - 1).get(i);
        }

        for (int row = n - 2; row >= 0; row--) {
            for (int col = row; col >= 0; col--) {
                int down = dp[row + 1][col];
                int diag = dp[row + 1][col + 1];
                dp[row][col] = triangle.get(row).get(col) + Math.min(down, diag);
            }
        }
        return dp[0][0];
    }
}
