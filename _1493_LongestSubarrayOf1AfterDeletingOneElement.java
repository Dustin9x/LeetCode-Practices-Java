public class _1493_LongestSubarrayOf1AfterDeletingOneElement {
    public static int longestSubarray(int[] nums) {
        int zero = 0;
        int res = 0;
        for (int i = 0, j=0; j < nums.length; j++) {
            if(nums[j] == 0){
                zero++;
            }
            while (zero>1){
                if(nums[i]==0){
                    zero--;
                }
                i++;
            }
            res = Math.max(res,j - i + 1);
        }
        return res-1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,1};
        System.out.println(longestSubarray(nums));
    }
}
