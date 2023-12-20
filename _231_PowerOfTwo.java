public class _231_PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        return (n>0&&((n&(n-1))==0));
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(isPowerOfTwo(n));
    }
}
