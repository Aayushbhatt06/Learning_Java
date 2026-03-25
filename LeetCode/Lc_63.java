
class LC_63 {

    int[][] dp;

    // tabulation
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }
        this.dp = new int[obstacleGrid.length][obstacleGrid[0].length];

        dp[m - 1][n - 1] = 1;

        for (int j = n - 2; j >= 0; j--) {
            if (obstacleGrid[m - 1][j] == 1) {
                dp[m - 1][j] = 0;
            } else {
                dp[m - 1][j] = dp[m - 1][j + 1];
            }
        }

        for (int i = m - 2; i >= 0; i--) {
            if (obstacleGrid[i][n - 1] == 1) {
                dp[i][n - 1] = 0;
            } else {
                dp[i][n - 1] = dp[i + 1][n - 1];
            }
        }

        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i + 1][j] + dp[i][j + 1];
                }
            }
        }

        return dp[0][0];
    }

    //call f(obstacleGrid,0,0) for ans
    // memoization
    public int f(int[][] arr, int i, int j) {
        if (i == arr.length - 1 && j == arr[0].length - 1) {
            return 1;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int ans = 0;
        if (i < arr.length - 1 && arr[i + 1][j] != 1) {
            ans += f(arr, i + 1, j);
        }
        if (j < arr[0].length - 1 && arr[i][j + 1] != 1) {
            ans += f(arr, i, j + 1);
        }
        return dp[i][j] = ans;
    }
}
