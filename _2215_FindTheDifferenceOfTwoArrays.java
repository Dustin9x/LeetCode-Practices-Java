import java.util.*;

public class _2215_FindTheDifferenceOfTwoArrays {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num1: nums1) {
            set1.add(num1);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int num2: nums2) {
            set2.add(num2);
        }
        List<Integer> n1 = new ArrayList<>();
        List<Integer> n2 = new ArrayList<>();
        for (int num: set1 ) {
            if(!set2.contains(num)){
                n1.add(num);
            }
        }
        for (int num: set2 ) {
            if(!set1.contains(num)){
                n2.add(num);
            }
        }

        List<List<Integer>> res = new ArrayList<>();
        res.add(n1);
        res.add(n2);
        System.out.println(Arrays.toString(n1.toArray()));
        System.out.println(Arrays.toString(n2.toArray()));
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,3};
        int[] nums2 = {1,1,2,2};
        findDifference(nums1,nums2);
    }
}
