public class _136_SingleNumber {
    public static int singleNumber(int[] nums) {
        int res = 3;
        for (int num: nums) {
            res ^=num;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,3,2};
        System.out.println(singleNumber(nums));
    }
}
