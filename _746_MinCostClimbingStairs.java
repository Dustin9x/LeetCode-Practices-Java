public class _746_MinCostClimbingStairs {
    public static int minCostClimbingStairs(int[] cost) {
        int[] total = new int[cost.length+1];

        //BTCS
        total[0] = 0;
        total[1] = 0;

        //CTTH:
        for (int i = 2; i <= cost.length; i++) {
            total[i] = Math.min(total[i-1] + cost[i-1], total[i-2] + cost[i-2]);
        }

        return total[cost.length];
    }

    public static void main(String[] args) {
        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(minCostClimbingStairs(cost));
    }
}
