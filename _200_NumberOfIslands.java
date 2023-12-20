import java.util.Set;

public class _200_NumberOfIslands {
    boolean[][] checked = new boolean[300][300];
    int row;
    int col;
    public boolean isValid(int i, int j){
        return i >= 0 && j >= 0 && i < row && j < col;
    }

    public void DFS(char[][]grid, int i, int j){
        if(!isValid(i,j) || grid[i][j] == '0' || checked[i][j]) {
            return;
        }
        checked[i][j] = true;
        DFS(grid,i,j+1);
        DFS(grid,i,j-1);
        DFS(grid,i-1,j);
        DFS(grid,i+1,j);
    }
    public int numIslands(char[][] grid) {
        row = grid.length;
        col = grid[0].length;
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(grid[i][j] == '1' && !checked[i][j]){
                    DFS(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
}
