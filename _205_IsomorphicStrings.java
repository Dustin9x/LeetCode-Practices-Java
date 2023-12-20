import java.util.HashMap;

public class _205_IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {

        int[] s1 = new int[128];
        int[] s2 = new int[128];
        for (int i = 0; i < s.length(); i++) {
            if(s1[s.charAt(i)] != s2[t.charAt(i)]){
                return false;
            }
            s1[s.charAt(i)]=i+1;
            s2[t.charAt(i)]=i+1;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egg", t = "add";
        System.out.println(isIsomorphic(s,t));
    }
}
