import java.util.Arrays;

public class _2160_MinimumSumOfFourDigitNumberAfterSplittingDigits {
    public static int minimumSum(int num) {
        int[] newNum = {num%10,(num/10)%10,(num/100)%10,num/1000};
        Arrays.sort(newNum);
        return newNum[0]*10 + newNum[3] + newNum[1]*10 + newNum[2];
    }

    public static void main(String[] args) {
        System.out.println(minimumSum(2932));
    }
}
