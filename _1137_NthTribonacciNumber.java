public class _1137_NthTribonacciNumber {
    public static int tribonacci(int n) {
        if(n == 0) return 0;
        if(n < 3) return 1;
        int[] nums = new int[n+1];
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 1;
        for (int i = 3; i <= n; i++) {
            nums[i] = nums[i-1] + nums[i-2]+nums[i-3];
        }
        return nums[n];
    }

    public static void main(String[] args) {
        System.out.println(tribonacci(0));
    }
}
