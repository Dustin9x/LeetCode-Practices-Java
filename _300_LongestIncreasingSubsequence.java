public class _300_LongestIncreasingSubsequence {
    public static int lengthOfLIS(int[] nums) {
        int mem[] = new int[nums.length];
        mem[0] = 1;
        int res = 1;
        for (int i = 1; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < i; j++) {
                if(nums[j] < nums[i]){
                    count = Math.max(mem[j],count);
                }
            }
            mem[i] = count+1;
            res = Math.max(mem[i],res);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }
}
