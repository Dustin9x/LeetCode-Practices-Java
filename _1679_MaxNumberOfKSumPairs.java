import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1679_MaxNumberOfKSumPairs {
    public static int maxOperations1(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            if(nums[left] + nums[right] == k){
                count++;
                left++;
                right--;
            }else if(nums[left] + nums[right] < k){
                left++;
            }else{
                right--;
            }
        }
        return count;
    }

    public static int maxOperations2(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for ( int i: nums ) {
            if(map.containsKey(k-i)){
                if(map.get(k-i) == 1){
                    map.remove(k-i);
                }else{
                    map.put(k-i,map.get(k-i)-1);
                }
                count++;
            }else{
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3,4,3};
        System.out.println(maxOperations2(nums,6));
    }
}
