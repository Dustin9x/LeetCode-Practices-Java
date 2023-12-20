public class _724_FindPivotIndex {
    public static int pivotIndex(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(leftSum * 2 == total - nums[i]){
                return i;
            }
            leftSum+=nums[i];

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1,-1,-1,-1,-1,0};
        System.out.println(pivotIndex(nums));
    }
}
