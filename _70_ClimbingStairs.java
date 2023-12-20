public class _70_ClimbingStairs {

    static int[] steps = new int[46];

    public static int count(int n){
        if(steps[n]==0){
            steps[n] = count(n-1) + count(n-2);
        }
        return steps[n];
    }
    public static int climbStairs(int n) {
        steps[1] = 1;
        steps[2] = 2;

        count(n);
        return steps[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(45));
    }
}
