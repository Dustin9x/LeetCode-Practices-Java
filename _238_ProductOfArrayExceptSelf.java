import java.util.Arrays;

public class _238_ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int [] rightPro = new int [nums.length];
        int [] leftPro = new int [nums.length];

        rightPro[0] = 1;
        for ( int i = 1; i < nums.length; i++ ) {
            rightPro[i] = nums[i - 1] * rightPro[i - 1];
        }

        leftPro[nums.length - 1] = 1;
        for ( int i = nums.length - 2; i >= 0; i-- ) {
            leftPro[i] = nums[i + 1] * leftPro[i + 1];
        }

        for ( int i = 0; i < nums.length; i++ ) {
            nums[i] = rightPro[i] * leftPro[i];
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {0,0};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
