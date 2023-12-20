public class _2293_MinMaxGame {
    public static int minMaxGame(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];

        int[] newNums = new int[n/2];
        for (int i = 0; i < n/2; i++) {
            if(i % 2 == 0) {
                newNums[i] = Math.min(nums[2*i],nums[2*i+1]);
            } else {
                newNums[i] = Math.max(nums[2*i],nums[2*i+1]);
            }
        }
        return minMaxGame(newNums);
    }

    public static void main(String[] args) {
        int[] nums = {70,38,21,22};
        System.out.println(minMaxGame(nums));
    }
}
