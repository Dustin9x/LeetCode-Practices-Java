import java.util.Arrays;

public class _414_ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {

        long[] maxArr = {Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE};

        for (int i = 0; i < nums.length; i++) {
            insert(maxArr, nums[i]);
        }
        if(maxArr[2] == Long.MIN_VALUE){
            return (int) maxArr[0];
        }
        return (int) maxArr[2];
    }

    private static void insert(long[] maxArr, int num) {
        int i = 0;
        while(i <maxArr.length){
            if(num == maxArr[i]){
                return; //ko dc trung
            } else if (num > maxArr[i]) {
                break;
            } else {
                i++;
            }
        }
        if(i < maxArr.length){
            for (int j = maxArr.length-2; j >= i ; j--) {
                maxArr[j+1] = maxArr[j];
            }
            maxArr[i]=num;
        }
        System.out.println(Arrays.toString(maxArr));
    }


    public static void main(String[] args) {
        int[] a = {5,3,2,7,8,1,2};
        System.out.println(thirdMax(a));
    }
}
