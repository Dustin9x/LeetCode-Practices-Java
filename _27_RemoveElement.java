import java.util.Arrays;

public class _27_RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int count = nums.length;
        for (int i = 0; i < count;) {
            if(nums[i] == val){
                for (int j = i; j < count-1; j++) {
                    nums[j] = nums[j+1];
                }
                count--;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }

    public static int removeElement2(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }


    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int result = removeElement2(nums,val);
        System.out.println(result);
    }
}
