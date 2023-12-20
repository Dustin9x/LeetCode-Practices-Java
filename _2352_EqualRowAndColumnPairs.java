import java.util.*;

public class _2352_EqualRowAndColumnPairs {
    public static int equalPairs(int[][] grid) {
        int n = grid.length;
        int count = 0;
        int[][] transpose = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transpose[i][j]=grid[j][i];
            }
        }
        for (int[] i : grid) {
            for (int[] j : transpose) {
                if(Arrays.equals(i, j)){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] grid = {{13,13},{13,13}};
        int[][] grid2 = {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
        System.out.println(equalPairs(grid));
    }
}
