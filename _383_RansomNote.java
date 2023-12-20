public class _383_RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] letter = new int[26];
        for (char c: magazine.toCharArray()) {
            letter[c-'a']++;
        }
        for (char c: ransomNote.toCharArray()) {
            if (letter[c-'a'] == 0) return false;
            letter[c-'a']--;
        }
        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "aab";
        String magazine = "bab";
        System.out.println(canConstruct(ransomNote,magazine));
    }
}
