public class _69_SqrtX {
    public static int mySqrt(int x) {
        int left = 1;
        int right = x;
        while (left<=right){
            int mid = left + (right - left)/2;
            if (mid*mid==x) {
                return mid;
            }else if (mid > x/mid) {
                right = mid - 1;
            }else{
                left = mid +1;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(1));
    }
}
