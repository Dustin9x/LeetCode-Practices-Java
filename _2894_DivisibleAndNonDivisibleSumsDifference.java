public class _2894_DivisibleAndNonDivisibleSumsDifference {
    public static int differenceOfSums(int n, int m) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(i % m != 0){
                sum+=i;
            }else{
                sum-=i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(differenceOfSums(10,3));
    }
}
