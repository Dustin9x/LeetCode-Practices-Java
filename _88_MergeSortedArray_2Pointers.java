import java.util.Arrays;

public class _88_MergeSortedArray_2Pointers {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = (m+n) - 1;
        while(k >= 0) {
            if(j < 0) {
                nums1[k] = nums1[i];
                i--;
            } else if (i < 0) {
                nums1[k] = nums2[j];
                j--;
            } else if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] n1 = {2,3,4,5,0,0,0};
        int[] n2 = {0,3,6};
        merge(n1,4,n2,3);
    }
}
