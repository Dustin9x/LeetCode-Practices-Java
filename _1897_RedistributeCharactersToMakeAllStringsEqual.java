public class _1897_RedistributeCharactersToMakeAllStringsEqual {
    public static boolean makeEqual(String[] words) {
        int n = words.length;
        if (n==1) return true;
        int[] c = new int[26];
        for (int i = 0; i < n; i++) {
            for (char ch: words[i].toCharArray()) {
                c[ch - 'a']++;
            }
        }
        for (int i : c) {
            if(i != 0 && i%n != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"caaaaa","aaaaaaaaa","a","bbb","bbbbbbbbb","bbb","cc","cccccccccccc","ccccccc","ccccccc","cc","cccc","c","cccccccc","c"};
        System.out.println(makeEqual(words));
    }
}
