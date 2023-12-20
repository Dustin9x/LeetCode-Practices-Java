import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1431_KidsWithTheGreatestNumberOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if(candies[i]>max) max = candies[i];
        }
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]+extraCandies>=max){
                res.add(true);
            } else{
                res.add(false);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extra = 1;
        System.out.println(kidsWithCandies(candies,extra));
    }
}
