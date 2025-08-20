class LC_1277 {
    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int k = 1;
                boolean f = true;
                
                if (matrix[i][j] == 1) {
                    count++;

                    while (f && i + k < m && j + k < n) {
                        for (int l = i; l <= i + k; l++) {
                            if (matrix[l][j + k] == 0) { f = false; break; }
                        }
                        for (int o = j; o <= j + k; o++) {
                            if (matrix[i + k][o] == 0) { f = false; break; }
                        }
                        if (f) count++;
                        k++;
                    }
                }
            }
        }
        return count;
    }
}
