
import java.util.Arrays;

class NinjaTraining {

    //tabulation
    public int maximumPoints(int mat[][]) {
        // code here
        int[][] dp = new int[mat.length][4];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        // for memo
        // return f(mat, mat.length - 1, 3, dp);
        dp[0][0] = Math.max(mat[0][1], mat[0][2]);
        dp[0][1] = Math.max(mat[0][0], mat[0][2]);
        dp[0][2] = Math.max(mat[0][0], mat[0][1]);
        dp[0][3] = Math.max(Math.max(mat[0][0], mat[0][1]), mat[0][2]);
        for (int i = 1; i < mat.length; i++) {
            for (int j = 0; j < 4; j++) {
                int maxi = 0;
                for (int a = 0; a < 3; a++) {

                    if (a != j) {
                        int t = mat[i][a] + dp[i - 1][a];
                        maxi = Math.max(maxi, t);
                    }

                }
                dp[i][j] = maxi;
            }
        }
        return dp[mat.length - 1][3];

    }

    // memoization
    public int f(int[][] mat, int i, int j, int[][] dp) {
        if (i <= 0) {
            int maxi = 0;
            for (int a = 0; a < 3; a++) {
                if (a != j) {
                    maxi = Math.max(maxi, mat[i][a]);
                }
            }
            return maxi;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int maxi = 0;

        for (int a = 0; a < 3; a++) {
            int t = 0;
            if (a != j) {
                t = mat[i][a] + f(mat, i - 1, a, dp);
            }
            maxi = Math.max(maxi, t);
        }

        return dp[i][j] = maxi;
    }
}
