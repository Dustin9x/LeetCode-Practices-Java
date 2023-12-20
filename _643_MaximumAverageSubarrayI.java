
public class _643_MaximumAverageSubarrayI {
    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum+=nums[i];
        }
        int result = sum;
        for (int i = k; i < nums.length; i++) {
            sum-=nums[i-k];
            sum+=nums[i];
            result = Math.max(result,sum);
        }
        return (double) result/k;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,1,3,3};
        int[] nums1 = {-5};
        System.out.println(findMaxAverage(nums,4));
    }
}
