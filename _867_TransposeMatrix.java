import java.util.Arrays;

public class _867_TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int col = matrix.length;
        int row = matrix[0].length;

        int res[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                res[i][j] = matrix[j][i];
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2 = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(transpose(matrix2)));
    }
}
