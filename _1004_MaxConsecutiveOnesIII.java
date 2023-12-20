public class _1004_MaxConsecutiveOnesIII {
    public static int longestOnes(int[] nums, int k) {
        int zero = 0;
        int one = 0;
        int res = 0;
        for (int i = 0, j = 0; j < nums.length; j++) {
            if(nums[j] == 1){
                one++;
            }else{
                zero++;
            }
            while(zero>k && i<=j){
                if(nums[i]==1){
                    one--;
                }else{
                    zero--;
                }
                i++;
            }
            res = Math.max(res,j-i+1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        System.out.println(longestOnes(nums,3));
    }
}
