public class _1281_SubtractTheProductAndSumOfDigitsOfAnInteger {
    public static int subtractProductAndSum(int n) {
        int mul = 1;
        int sum = 0;
        while(n>0){
            mul*=n%10;
            sum+=n%10;
            n/=10;
        }
        return mul-sum;
    }

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }
}
