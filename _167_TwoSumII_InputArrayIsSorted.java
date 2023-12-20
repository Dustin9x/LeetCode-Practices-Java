import java.util.Arrays;

public class _167_TwoSumII_InputArrayIsSorted {
    public static int[] twoSum(int[] numbers, int target) {
        int a = 0;
        int b = numbers.length - 1;
        while (a < b && numbers[a]+numbers[b] != target) {
            if((numbers[a] + numbers[b]) > target) {
                b--;
            } else {
                a++;
            }
        }
        return new int[] {a+1,b+1};
    }

    public static void main(String[] args) {
        int[] nums = {3,24,50,79,88,150,345};
        System.out.println(Arrays.toString(twoSum(nums, 200)));
    }
}
