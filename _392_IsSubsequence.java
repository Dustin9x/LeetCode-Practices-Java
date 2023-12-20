public class _392_IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        for (int i = 0; i < s.length();i++) {
            char c = s.charAt(i);
            if(t.indexOf(c) >= 0 ){
                t = t.substring(t.indexOf(c)+1);
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "twn";
        String t = "txxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxwxxxxxxxxxxxxxxxxxxxxn";
        System.out.println(isSubsequence(s,t));
    }
}
