public class _1662_CheckIfTwoStringArraysAreEquivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1= new StringBuilder();
        StringBuilder s2= new StringBuilder();
        for (String s : word1) {
            s1.append(s);
        }
        for (String s : word2) {
            s2.append(s);
        }
        if(s1.toString().equals(s2.toString())){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] word1  = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
}
