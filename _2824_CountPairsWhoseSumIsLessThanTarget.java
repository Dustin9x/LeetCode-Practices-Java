import java.util.ArrayList;
import java.util.List;

public class _2824_CountPairsWhoseSumIsLessThanTarget {
    public static int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i+1; j < nums.size(); j++) {
                if(i<j && nums.get(i)+nums.get(j) < target){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(-1);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);
        System.out.println(countPairs(nums,2));
    }
}
