
import java.util.ArrayList;
import java.util.List;

public class LC_73 {
    public static void main(String[] args) {
        int[][] m= {
            {1,2,3},
            {4,0,6},
            {7,0,9}
        };
        conv(1, 1, m);
        // System.out.println(Arrays.deepToString(m));
    }
    public void setZeroes(int[][] matrix) {
        List<int[]> addr = new ArrayList();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0){
                    addr.add(new int[] {i,j});
                }
            }
        }
        for(int[] p : addr){
            conv(p[0], p[1], matrix);
        }

    }
    static void conv(int a, int b, int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            mat[a][i] = 0;
        }
        for (int i = 0; i < mat.length; i++) {
            mat[i][b] = 0;
        }
        // System.out.println(Arrays.deepToString(mat));
    }
}
