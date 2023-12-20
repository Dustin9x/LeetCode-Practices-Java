import java.util.Arrays;

public class _338_CountingBits {

    public static int[] countBits(int n) {
        int res[] = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            res[i] = numOfBits(i);
        }
        return res;
    }
    public static int numOfBits(int n){
        int count = 0;
        while(n!=0){
            if((n&1) == 1){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));
    }
}
