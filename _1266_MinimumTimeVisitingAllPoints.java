import java.util.Arrays;

public class _1266_MinimumTimeVisitingAllPoints {
    public static int minTimeToVisitAllPoints(int[][] points) {
        int res = 0;
        for (int i = 0; i < points.length-1; i++) {
            int a = abs(points[i][0] - points[i+1][0]);
            int b = abs(points[i][1] - points[i+1][1]);
            res += max(a,b);
        }
        return res;
    }

    public static int abs(int a){
        if (a<0) return a*(-1);
        return a;
    }
    public static int max(int a, int b){
        if(a>b) return a;
        return b;
    }

    public static void main(String[] args) {
        int[][] points = {{1,1},{3,4},{-1,0}};
        int[][] points2 = {{3,2},{-2,2}};
        System.out.println(minTimeToVisitAllPoints(points2));
    }
}
