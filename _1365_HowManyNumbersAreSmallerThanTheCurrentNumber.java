import java.util.Arrays;

public class _1365_HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[j] < nums[i]){
                    count++;
                }
            }
            res[i] = count;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
}
