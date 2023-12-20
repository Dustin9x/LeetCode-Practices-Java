public class _941_ValidMountainArray {
    public static boolean validMountainArray(int[] arr) {
        int n = arr.length;
        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>arr[maxIndex]){
                maxIndex = i;
            }
        }
        if(n<3 || maxIndex == n-1 || maxIndex == 0) {
            return false;
        } else {
            for (int i = 0; i < maxIndex; i++) {
                if(arr[i] >= arr[i+1]) return false;
            }
            for (int i = n-1; i > maxIndex; i--) {
                if(arr[i] >= arr[i-1]) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(validMountainArray(arr));
    }
}
