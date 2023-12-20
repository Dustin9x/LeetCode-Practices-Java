import java.util.Arrays;

public class _1470_ShuffleTheArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] res = new int[2*n];
        for(int i = 0; i < 2*n; i+=2){
            res[i] = nums[i/2];
            res[i+1] = nums[i/2+n];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,3,2,1};
        System.out.println(Arrays.toString(shuffle(nums, 4)));
    }
}
