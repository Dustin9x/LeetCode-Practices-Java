import java.util.ArrayList;
import java.util.List;

public class _2859_SumOfValuesAtIndicesWithKSetBits {

    public static int countBit(int n){
        int count = 0;
        while(n!=0){
            if((n&1) == 1) {
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            if(countBit(i) == k){
                sum+=nums.get(i);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(10);
        nums.add(1);
        nums.add(5);
        nums.add(2);
        System.out.println(sumIndicesWithKSetBits(nums,1));
    }
}
