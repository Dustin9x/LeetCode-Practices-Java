public class _1816_TruncateSentence {
    public static String truncateSentence(String s, int k) {
        int i = 1;
        while (k > 0 && i < s.length()-1) {
            if (s.charAt(i) == ' ' ) {
                k--;
            }
            i++;
        }
        if(k > 0) return s;
        return s.substring(0, i-1);
    }

    public static void main(String[] args) {
        String s = "chopper is not a tanuki";
        System.out.println(truncateSentence(s, 5));
    }
}
