import java.util.Arrays;

public class _189_RotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        while(k>n) {
            k=k-n;
        }
        int[] res = new int[n];
        for (int i = 0; i < k; i++) {
            res[i] =nums[n-k+i];
        }
        for (int i = k; i < n; i++) {
            res[i] = nums[i-k];
        }
        for (int i = 0; i < n; i++) {
            nums[i] =res[i];
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {-1,2};
        rotate(nums, 3);
    }
}
