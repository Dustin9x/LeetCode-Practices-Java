public class _53_MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] sums = new int[n];
        sums[0] = nums[0];
        for (int i = 1; i < n; i++) {
            sums[i] = sums[i - 1] + nums[i];
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum_i_j = sums[j] - sums[i] + nums[i];
                result = Math.max(result, sum_i_j);
            }
        }
        return result;
    }

    public static int maxSubArray2(int[] nums) {
        int n = nums.length;
        int[] max = new int[n];
        max[0] = nums[0];
        int result = nums[0];
        for (int i = 1; i < n; i++) {
            max[i] = Math.max(nums[i], nums[i] + max[i-1]);
            result = Math.max(result,max[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {5, 4, -1, 7, 8};
        System.out.println(maxSubArray2(nums));
    }
}
