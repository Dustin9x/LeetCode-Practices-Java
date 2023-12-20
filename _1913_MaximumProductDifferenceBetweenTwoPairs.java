public class _1913_MaximumProductDifferenceBetweenTwoPairs {
    public static int maxProductDifference(int[] nums) {
        Integer max = null;
        Integer secondMax = null;
        Integer min = null;
        Integer secondMin = null;
        for (int num: nums) {
            if(max == null || num >= max){
                secondMax = max;
                max = num;
            }else if(secondMax == null || num >= secondMax){
                secondMax = num;
            }
            if(min == null || num <= min){
                secondMin = min;
                min = num;
            }else if(secondMin == null || num <= secondMin){
                secondMin = num;
            }
        }
        return max*secondMax - min*secondMin;
    }

    public static void main(String[] args) {
        int[] nums = {5,9,4,6};
        System.out.println(maxProductDifference(nums));
    }
}
