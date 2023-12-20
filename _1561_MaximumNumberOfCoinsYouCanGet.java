import java.util.Arrays;

public class _1561_MaximumNumberOfCoinsYouCanGet {
    public static int maxCoins(int[] piles) {
        int res = 0;
        Arrays.sort(piles);
        for (int i = piles.length/3; i < piles.length; i+=2) {
            res+=piles[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] piles = {9,8,7,6,5,1,2,3,4};
        System.out.println(maxCoins(piles));
    }
}
