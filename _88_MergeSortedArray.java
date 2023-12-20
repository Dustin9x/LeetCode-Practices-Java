import java.util.Arrays;

public class _88_MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for ( int ai : nums2) {
            insertArray(ai,nums1,m);
            m++;
        }
        System.out.println(Arrays.toString(nums1));
    }

    private static int[] insertArray(int x, int[] arr, int m) {
        for (int i = 0; i <= m; i++) {
            if(arr[i] > x){
                for (int j = m-1; j >= i; j--) {
                    arr[j+1] = arr[j];
                }
                arr[i] = x;
                break;
            } else {
                arr[m] = x;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] n1 = {2,3,4,5,0,0,0};
        int[] n2 = {3,0,6};
        merge(n1,4,n2,3);
    }
}
