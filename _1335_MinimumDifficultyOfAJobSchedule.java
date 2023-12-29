public class _1335_MinimumDifficultyOfAJobSchedule {
    private static int n;
    private static Integer[][] dp;
    public static int minDifficulty(int[] jobDifficulty, int d) {
        n = jobDifficulty.length;
        dp = new Integer[n][d+1];

        if(n < d) return -1;
        return helper(0, jobDifficulty, d);
    }

    private static int helper(int startingJobId, int[]jd , int dayLeft) {
        if(startingJobId == n || dayLeft == 0) return 0; //khong con job hoac khong con day left
        if(dp[startingJobId][dayLeft] != null) return dp[startingJobId][dayLeft];

        int maxJob = 0;
        int minCost = Integer.MAX_VALUE;
        for (int i = startingJobId; i < n; i++) {
            if(n - i < dayLeft) break;
            maxJob = Math.max(maxJob,jd[i]);
            if(dayLeft == 0) {
                minCost = maxJob;
            }else{
                minCost = Math.min(minCost,maxJob + helper(i+1,jd,dayLeft-1));
            }
        }
        return dp[startingJobId][dayLeft] = minCost;
    }
}
