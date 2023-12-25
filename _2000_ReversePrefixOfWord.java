public class _2000_ReversePrefixOfWord {
    public static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch)+1;
        return reverse(word.substring(0,index)) + word.substring(index);
    }

    public static String reverse(String word){
        StringBuilder res = new StringBuilder();
        for (int i = word.length()-1; i >=0 ; i--) {
            res.append(word.charAt(i));
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word,ch));
    }
}
