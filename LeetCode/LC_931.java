public class LC_931 {
    int[][] dp;

    public int minFallingPathSum(int[][] matrix) {
        // return f(matrix, 0, 0);
        this.dp = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                dp[i][j] = 101;
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            min = Math.min(min, f(matrix, 0, i));
        }
        return min;
    }

    public int f(int[][] mat, int r, int c) {
        if (r == mat.length - 1) {
            return mat[r][c];
        }
        if (dp[r][c] != 101) {
            return dp[r][c];
        }
        int min = Integer.MAX_VALUE;
        int l = Integer.MAX_VALUE;
        int n = Integer.MAX_VALUE;
        if (c - 1 >= 0) {
            l = mat[r][c] + f(mat, r + 1, c - 1);
        }
        int m = mat[r][c] + f(mat, r + 1, c);
        if (c + 1 <= mat.length - 1) {
            n = mat[r][c] + f(mat, r + 1, c + 1);
        }

        return dp[r][c] = Math.min(l, Math.min(m, n));
    }
}
