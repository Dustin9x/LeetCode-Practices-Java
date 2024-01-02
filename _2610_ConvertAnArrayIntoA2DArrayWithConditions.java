import java.util.ArrayList;
import java.util.List;

public class _2610_ConvertAnArrayIntoA2DArrayWithConditions {
    public static List<List<Integer>> findMatrix(int[] nums) {
        int[] count = new int[nums.length + 1];
        List<List<Integer>> res = new ArrayList<>();
        for (int num : nums) {
            if(count[num] == res.size()){
                res.add(new ArrayList<>());
            }
            res.get(count[num]).add(num);
            count[num]++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,1,2,3,1};
        System.out.println(findMatrix(nums));
    }
}
