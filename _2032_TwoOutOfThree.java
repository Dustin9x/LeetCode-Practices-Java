import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _2032_TwoOutOfThree {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        boolean[] b1 = new boolean[101];
        boolean[] b2 = new boolean[101];
        boolean[] b3 = new boolean[101];

        for (int num:nums1) {
            b1[num] = true;
        }
        for (int num:nums2) {
            b2[num] = true;
        }

        for (int num:nums3) {
            b3[num] = true;
        }
        
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            if(b1[i] && b2[i] || b1[i] && b3[i] || b2[i] && b3[i]){
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,1,3,2};
        int[] nums2 = {2,3,1};
        int[] nums3 = {3};
        System.out.println(twoOutOfThree(nums1,nums2,nums3));
    }
}
