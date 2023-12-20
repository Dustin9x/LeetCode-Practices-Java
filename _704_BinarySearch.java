public class _704_BinarySearch {
    public static int search(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }


    //Cach 2: de quy
    public static int bSearch(int[] nums, int target) {
        int n = nums.length;
        return bSearch(nums, target, 0, n - 1);
    }

    private static int bSearch(int[] nums, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (target == nums[mid]) {
            return mid;
        } else if (target > nums[mid]) {
            return bSearch(nums, target, mid+1, right);
        } else {
            return bSearch(nums, target, left, mid-1);
        }
    }


    public static void main(String[] args) {
        int nums[] = {-1, 0, 3, 5, 9, 12};
        System.out.println(search(nums, 9));
//        System.out.println(bSearch(nums, 9));
    }
}
