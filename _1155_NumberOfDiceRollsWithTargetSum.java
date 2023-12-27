import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1155_NumberOfDiceRollsWithTargetSum {
    final static int mod = (int) 1e9+7;
    public static int numRollsToTarget2(int n, int k, int target) {
        int[][] dp = new int[n + 1][target + 1];

        for (int[] d : dp) {
            Arrays.fill(d, -1);
        }
        return recusion(dp, n, k, target);
    }

    public static int recusion(int[][] dp, int n, int k, int target) {
        if (target == 0 && n == 0) return 1;
        if (target <= 0 || n == 0) return 0;

        if (dp[n][target] != -1) return (int) (dp[n][target] % mod);

        int sum = 0;
        for (int i = 1; i <= k; i++) {
            sum = (sum + recusion(dp,n - 1, k, target - i)) % mod; //dùng 1 dice đầu tiên, số dice giảm 1, target giảm i với i là mặt của dice;
        }
        dp[n][target] = sum % mod;
        return dp[n][target];
    }

    public static void main(String[] args) {
        System.out.println(numRollsToTarget2(2, 6, 7));
    }
}
