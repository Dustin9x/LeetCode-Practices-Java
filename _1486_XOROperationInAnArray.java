public class _1486_XOROperationInAnArray {
    public static int xorOperation(int n, int start) {
        int[] nums = new int[n];
        int res = 0;
        nums[0] = start;
        res ^= start;
        for(int i = 1; i < n; i++){
            nums[i] = start + 2 * i;
            res ^= nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(xorOperation(4,3));
    }
}
