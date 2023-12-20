public class _2011_FinalValueOfVariableAfterPerformingOperations {
    public static int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for (String str: operations) {
            if(str.contains("--")){
                res--;
            }else if(str.contains("++")){
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] operations = {"++X","++X","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }
}
