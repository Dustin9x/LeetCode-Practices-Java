public class _1464_MaximumProductOfTwoElementsInAnArray {
    public static int maxProduct(int[] nums) {
        int res = 0;
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res = Math.max(res, (max-1) * (nums[i]-1));
            max = Math.max(max, nums[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,5,4,5};
        System.out.println(maxProduct(nums));
    }
}
