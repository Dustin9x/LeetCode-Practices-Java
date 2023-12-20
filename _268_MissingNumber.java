import java.util.Arrays;

public class _268_MissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        for (int i = 0; i < n; i++) {
            sum = sum - nums[i];
        }
        return sum;
    }

    //Cach 2:
    public static int missingNumber2(int[] nums) {
        int n = nums.length;
        int result = 0;
        for (int ai : nums) {
            result ^= ai;
        }
        for (int i = 0; i <= n; i++) {
            result ^= i;
        }
        return result;
    }

    public static int missingNumber3(int[] nums) {
        int max = 0;
        int sum = (nums.length+1)*(nums.length+2)/2;

//        for(int i=0; i<nums.length; i++){
//            if(nums[i] > max){
//                max = nums[i];
//            }
//            sum+=nums[i];
//        }
        return max*(max+1)/2 - sum;
    }



    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(missingNumber3(arr));
    }
}
