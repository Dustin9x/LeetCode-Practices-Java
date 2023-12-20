import java.util.Arrays;

public class _283_MoveZeroes {
    public static void moveZeroes(int[] nums) {
        for (int i=0, j=0; i <nums.length && j <nums.length ; j++){
            if(nums[j] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {2,1,0,0,12};
        moveZeroes(nums);
    }
}
