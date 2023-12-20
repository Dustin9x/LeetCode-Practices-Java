import java.util.Arrays;

public class _9_PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if(x<0) return false;
        int y = x;
        int length = 1;
        while(x>=10){
            x = x/10;
            length++;
        }

        int[] num = new int[length];
        for (int i = length-1; i >=0 ; i--) {
            num[i] = y%10;
            y = y/10;
        }
        int i = 0;
        int j = length-1;
        while(i<j){
            if(num[i] != num[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean isPalindrome2(int x) {
        int revertX = 0;
        int copy = x;
        while(copy>0){
            revertX = revertX*10 +copy%10;
            copy=copy/10;
        }
        if(revertX == x){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome2(1212));
    }
}
