public class _1863_SumOfAllSubsetXORTotals {
    private int N;
    private int[] selections = null;
    private int[] validValues = {0,1};
    private int resultSum = 0;
    private int[] nums = null;
    private int XORtotal(){
        int sum = 0;
        for (int i = 0; i < selections.length; i++) {
            if(selections[i] == 1){
                sum = sum^this.nums[i];
            }
        }
        return sum;
    }

    private void backtrack(int index){
        for (int i = 0; i < validValues.length; i++) {
            selections[index] = validValues[i];
            if(index == this.N -1){ //final index
                int sum = XORtotal();
                this.resultSum += sum;
            }else{
                backtrack(index+1);
            }
        }
    }
    public int subsetXORSum(int[] nums) {
        this.N = nums.length;
        this.selections = new int[this.N];
        this.nums = nums;
        backtrack(0);
        return this.resultSum;
    }
}
