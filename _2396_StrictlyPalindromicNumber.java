public class _2396_StrictlyPalindromicNumber {
    public static String convert(int a, int b){
        String res = "";
        while(a>=b){
            res+=a%b;
            a/=b;
        }
        return res+a;
    }
    public static boolean isStrictlyPalindromic(int n) {
        boolean res = false;
        for (int i = 2; i < n-2; i++) {
            String check = convert(n,i);
            int k = 0, l = 0;
            while(k<l){
                if(check.charAt(k) == check.charAt(l)){
                    res = true;
                }
                k++;
                l--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(isStrictlyPalindromic(9));
    }
}
