import java.util.ArrayList;
import java.util.List;

public class _448_FindAllNumbersDisappearedInAnArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = nums[i] > 0 ? nums[i] : - nums[i];
            if(nums[index-1]>0){
                nums[index-1] = -nums[index-1];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0){
                result.add(i+1);
            }
        }
        return result;
    }

    //Cach 2
    public static List<Integer> findDisappearedNumbers2(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        int[] checkNum = new int[n+1];
        for (int i = 0; i < n; i++) {
            checkNum[nums[i]] = nums[i];
        }
        for (int i = 1; i < checkNum.length; i++) {
            if(checkNum[i]==0){
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers2(nums));
    }
}
