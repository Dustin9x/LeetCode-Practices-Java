import java.util.Arrays;

public class _977_SquaresOfASortedArray {
    public static int[] sortedSquares(int[] nums) {
        int a = 0;
        int b = nums.length -1;
        int result[] = new int[nums.length];
        int i=b;
        while(a<=b) {
            if (nums[a]*(-1) < nums[b]){
                result[i] = nums[b] * nums[b];
                b--;
            } else {
                result[i] = nums[a] * nums[a];
                a++;
            }
            i--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}
