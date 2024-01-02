public class _1624_LargestSubstringBetweenTwoEqualCharacters {
    public static int maxLengthBetweenEqualCharacters(String s) {
        int n = s.length();
        int max = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(s.charAt(i) == s.charAt(j)){
                    max = Math.max(max,j-i-1);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "ojdncpvyneq";
        System.out.println(maxLengthBetweenEqualCharacters(s));
    }
}
