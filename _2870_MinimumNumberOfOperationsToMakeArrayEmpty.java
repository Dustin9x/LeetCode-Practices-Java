import java.util.HashMap;
import java.util.Map;

public class _2870_MinimumNumberOfOperationsToMakeArrayEmpty {
    public static int minOperations(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int res = 0;
        for (int key : map.values()) {
            if(key == 1){
                return -1;
            }else{
                res+= Math.ceil(key*1.0 / 3); // convert type of key to double
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {14,12,14,14,12,14,14,12,12,12,12,14,14,12,14,14,14,12,12};
        System.out.println(minOperations(nums));
    }
}
