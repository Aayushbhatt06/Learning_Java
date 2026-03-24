package LeetCode;

class LC_1975 {

    public static long maxMatrixSum(int[][] matrix) {
        long min = Integer.MAX_VALUE;
        long sum = 0;
        long nc = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int a = Math.abs(matrix[i][j]);
                sum += a;
                if (a < min) {
                    min = a;
                }
                if (matrix[i][j] < 0) {
                    nc++;
                }
            }
        }
        if (nc % 2 == 0) {
            return sum;
        } else {
            return sum - 2*min;
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {-1, -2, -3}, {1, 2, 3}};
        System.out.println(maxMatrixSum(arr));
    }
}
