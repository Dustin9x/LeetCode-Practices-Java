import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class _1657_DetermineIfTwoStringsAreClose {
    public static boolean closeStrings(String word1, String word2) {
        boolean res = false;
        if(word1.length() != word2.length()) return res;
        int[] w1 = new int[26];
        int[] w2 = new int[26];
        for (char c: word1.toCharArray()) {
            w1[c - 'a']++;
        }
        for (char c: word2.toCharArray()) {
            w2[c - 'a']++;
        }
        System.out.println(Arrays.toString(w1));
        System.out.println(Arrays.toString(w2));
        res = check(w1,w2);
        return res;
    }

    public static boolean check(int[] a, int[] b){
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=0 && b[i]==0 || a[i]==0 && b[i]!=0){
                return false;
            }
        }

        HashMap<Integer, Integer> mp1 = new HashMap<>();
        HashMap<Integer, Integer> mp2 = new HashMap<>();
        for (int i : a) {
            if (mp1.get(i) != null){
                mp1.put(i, mp1.get(i) + 1);
            }else{
                mp1.put(i, 1);
            }
        }
        for (int i : b) {
            if (mp2.get(i) != null){
                mp2.put(i, mp2.get(i) + 1);
            }else{
                mp2.put(i, 1);
            }
        }

        for (var entry : mp1.entrySet()) {
            Integer key = entry.getKey();
            if (!Objects.equals(mp2.get(key), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String word1 = "uau";
        String word2 = "ssx";
        System.out.println(closeStrings(word1,word2));
    }
}
