public class _7_ReverseInteger {
    public static int reverse(int x) {
        double sum = 0;
        while(x != 0){
            int digit = x%10;
            if(sum*10+digit>=Integer.MAX_VALUE|| sum*10+digit<=Integer.MIN_VALUE){
                sum=0;
                break;
            }
            sum = sum*10+digit;
            x/=10;
        }
        return (int)sum;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1234));
    }
}
