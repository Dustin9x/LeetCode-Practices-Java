import java.util.Arrays;

public class _661_ImageSmoother {
    public static int[][] imageSmoother(int[][] img) {
        int row = img.length;
        int col = img[0].length;

        int[][] res = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int count = 0;
                int sum = 0;
                for (int k = Math.max(0,i-1); k < Math.min(row,i+2); k++) {
                    for (int l = Math.max(0,j-1); l < Math.min(col,j+2); l++) {
                        sum+=img[k][l];
                        count++;
                    }
                }
                res[i][j] = sum/count;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] img = {{100,200,100},{200,50,200},{100,200,100}};
        System.out.println(Arrays.deepToString(imageSmoother(img)));
    }
}
