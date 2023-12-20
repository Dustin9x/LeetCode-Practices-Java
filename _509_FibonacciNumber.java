public class _509_FibonacciNumber {
    static int[] f = new int[30];
    public static int fib(int n) {
        if (f[n] != 0) return f[n];
        if(n <= 1) return n;

        return f[n] = fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fib(10));
    }
}
