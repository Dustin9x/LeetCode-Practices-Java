public class _151_ReverseWordsInAString {
    public static String reverseWords(String s) {
        String[] newString = s.split(" +");
        StringBuilder result = new StringBuilder();
        int n = newString.length - 1;
        for (int i = n; i >= 0; i--) {
            result.append(newString[i]).append(' ');
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }
}
