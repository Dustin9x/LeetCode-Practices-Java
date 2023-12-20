import java.util.Arrays;

public class _2965_FindMissingAndRepeatedValues {
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] nums = new int[n*n+1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nums[grid[i][j]]++;
            }
        }
        int[] res = new int[2];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>1) res[0] = i;
            if(nums[i]==0) res[1] = i;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] grid = {{1,3},{2,2}};
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(grid)));
    }
}
