public class _169_MajorityElement {
    public static int majorityElement(int[] nums) {
        int key = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                key = num;
            }
            if (num == key) {
                count++;
            } else {
                count--;
            }
        }
        return key;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
