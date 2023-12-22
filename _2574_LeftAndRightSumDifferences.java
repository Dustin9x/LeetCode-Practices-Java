import java.util.Arrays;

public class _2574_LeftAndRightSumDifferences {
    public static int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int [n];
        int[] rightSum = new int [n];
        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i-1]+nums[i-1];
            rightSum[n-i-1] = rightSum[n-i]+nums[n-i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {10,4,8,3};
        System.out.println(Arrays.toString(leftRightDifference(nums)));
    }
}
