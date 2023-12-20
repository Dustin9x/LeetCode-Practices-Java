public class _2264_Largest3SameDigitNumberInString {
    public static String largestGoodInteger(String num) {
        String[] pattern = {"999","888","777","666","555","444","333","222","111","000"};

        for (String pat: pattern) {
            if(num.contains(pat)){
                return pat;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String num = "6777133339";
        System.out.println(largestGoodInteger(num));
    }
}
