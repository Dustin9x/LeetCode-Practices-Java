public class _136_SingleNumber {
    public static int singleNumber(int[] nums) {
        int res = 0;
        for (int num: nums) {
            res ^=num;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,2,1};
        System.out.println(singleNumber(nums));
    }
}
