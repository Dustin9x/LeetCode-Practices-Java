import java.util.Arrays;

public class _1480_RunningSumOf1dArray {
    public static int[] runningSum(int[] nums) {
        for (int i = 0, j=1; j < nums.length; i++, j++) {
            nums[j] = nums[i] + nums[j];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
