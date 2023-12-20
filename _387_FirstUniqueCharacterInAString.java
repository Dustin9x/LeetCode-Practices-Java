import java.util.Arrays;
import java.util.HashMap;

public class _387_FirstUniqueCharacterInAString {
    public static int firstUniqChar(String s) {
        int[] count = new int[26];
        for (Character c : s.toCharArray()) {
            count[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    //Cach 2
    public static int firstUniqChar2(String s) {
        HashMap<Character,Integer> myMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(myMap.containsKey(c) == false) {
                myMap.put(c,1);
            } else{
                myMap.put(c,myMap.get(c)+1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (myMap.get(c) == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }
}
