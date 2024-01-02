import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _455_AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        for (int j = 0; i < g.length && j < s.length; j++) {
            if(g[i] <= s[j]) i++;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {3};
        System.out.println(findContentChildren(g,s));
    }
}
