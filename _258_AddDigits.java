public class _258_AddDigits {
    public static int addDigits(int num) {

        while(num >= 10){
            int sum = 0;
            while(num != 0){
                sum+=num%10;
                num/=10;
            }
            num = sum;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(addDigits(388));
    }
}
