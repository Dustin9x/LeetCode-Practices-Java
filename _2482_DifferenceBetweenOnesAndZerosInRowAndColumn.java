import java.util.Arrays;

public class _2482_DifferenceBetweenOnesAndZerosInRowAndColumn {
    public static int[][] onesMinusZeros(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[] rowCount = new int[row];
        int[] colCount = new int[col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(grid[i][j] == 1){
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }

        int[][]res = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                res[i][j] = 2 * rowCount[i] + 2 * colCount[j] - row - col;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] grid = {{1,1,1},{1,1,1}};
        System.out.println(Arrays.deepToString(onesMinusZeros(grid)));
    }
}
