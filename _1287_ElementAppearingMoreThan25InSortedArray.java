public class _1287_ElementAppearingMoreThan25InSortedArray {
    public static int findSpecialInteger(int[] arr) {
        int quarter = arr.length/4;
        for (int i = 0; i < arr.length-quarter; i++) {
            if(arr[i] == arr[i+quarter]){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,1};
        System.out.println(findSpecialInteger(arr));
    }
}
