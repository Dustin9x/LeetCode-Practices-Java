public class _1863_SumOfAllSubsetXORTotals_Solution2 {
    private int N;
    private int[] selections = null;
    private int[] validValues = {0,1};
    private int resultSum = 0;
    private int[] nums = null;

    private void backtrack(int index, int curXOR){
        for (int i = 0; i < validValues.length; i++) {
            selections[index] = validValues[i];
            if(selections[index] == 1){
                curXOR = curXOR ^ this.nums[index];
            }
            if(index == this.N -1){ //final index
                int sum = curXOR;
                this.resultSum += sum;
            }else{
                backtrack(index+1,curXOR);
            }
        }
    }
    public int subsetXORSum(int[] nums) {
        this.N = nums.length;
        this.selections = new int[this.N];
        this.nums = nums;
        backtrack(0,0);
        return this.resultSum;
    }
}
