public class _334_IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        int small = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;

        for (int num: nums) {
            if(num<=small){
                small = num;
            }else if (num <= mid){
                mid = num;
            }else{ // chac chan co so lon hon mid
                return true;
            }
        }
        return false;
    }
}
