public class _1582_SpecialPositionsInABinaryMatrix {
    public static int numSpecial(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int rowSum[] = new int[row];
        int colSum[] = new int[col];
        int res = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(mat[i][j] == 1){
                    rowSum[i]++;
                    colSum[j]++;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(mat[i][j] == 1 && rowSum[i] == 1 && colSum[j] == 1){
                    res++;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,0,0},{0,0,1},{1,0,0}};
        int[][] mat2 = {{1,0,0},{0,1,0},{0,0,1}};
        System.out.println(numSpecial(mat2));
    }
}
