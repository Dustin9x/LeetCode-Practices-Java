package Study;

import java.util.Arrays;

public class _2545_SortTheStudentsByTheirKthScore {
    public static int[][] sortTheStudents(int[][] score, int k) {
        boolean isSorted;
        for (int i = 0; i < score.length-1; i++) {
            isSorted = true;
            for (int j = 0; j < score.length-i-1; j++) {
                if(score[j+1][k] > score[j][k]){
                    isSorted=false;
                    int [] temp = score[j];
                    score[j] = score[j+1];
                    score[j+1] = temp;

                }
            }
            if(isSorted) break;
        }
        return score;
    }

    public static void main(String[] args) {
        int[][] score = {{4,8,3,15},{10,6,9,1},{7,5,11,2}};
        System.out.println(Arrays.deepToString(sortTheStudents(score, 2)));
    }
}
