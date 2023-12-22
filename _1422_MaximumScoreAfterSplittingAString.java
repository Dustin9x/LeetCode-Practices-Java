public class _1422_MaximumScoreAfterSplittingAString {
    public static int maxScore(String s) {
        int totalOne = 0;
        for (char c: s.toCharArray()) {
            if(c == '1') totalOne++;
        }
        int res = 0;
        int leftZero = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) == '0'){
                leftZero++;
            }else{
                totalOne--;
            }
            res = Math.max(res,leftZero+totalOne);
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "011101";
        System.out.println(maxScore(s));;
    }
}
