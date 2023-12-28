public class _1578_MinimumTimeToMakeRopeColorful {
    public static int minCost(String colors, int[] neededTime) {
        int res = 0;
        for (int i = 0, j=1; j < neededTime.length; j++) {
            if(colors.charAt(i) == colors.charAt(j)) {
                res+= Math.min(neededTime[i],neededTime[j]);
                if(neededTime[i] < neededTime[j]){
                    i = j;
                }
            }else{
                i = j;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String colors = "aaabbbabbbb";
        int[] neededTime = {3,5,20,7,5,3,5,5,4,8,1};
        System.out.println(minCost(colors,neededTime));
    }
}
