import java.util.HashSet;
import java.util.Set;

public class _202_HappyNumber {
    public static boolean isHappy(int n) {
        Set<Integer> memo = new HashSet<>();
        while(n!= 1){
            if(memo.contains(n)){
                return false;
            }
            memo.add(n);
            int sum = 0;
            while (n != 0){
                int digit = n%10;
                sum += digit * digit;
                n = n/10;
            }
            n = sum;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
