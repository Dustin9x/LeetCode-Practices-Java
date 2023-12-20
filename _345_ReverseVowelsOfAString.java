import java.util.Arrays;
import java.util.Stack;

public class _345_ReverseVowelsOfAString {
    public static String reverseVowels(String s) {
        Stack<String> store = new Stack<String>();
        String pattern = "aeiouAEIOU";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(pattern.indexOf(c) >= 0){
                store.push(String.valueOf(c));
            }
        }
        char[] string = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            char c = string[i];
            if(pattern.indexOf(c) >= 0){
                char t = store.peek().charAt(0);
                string[i] = t;
                store.pop();
            }
        }
        String res = new String(string);
        return res;
    }

    public static String reverseVowels2(String s) {
        String pattern = "aeiouAEIOU";
        int i = 0;
        int j = s.length()-1;
        char[] check = s.toCharArray();
        while (i < j){
            while(i<j && pattern.indexOf(check[i]) < 0){
                i++;
            }
            while(j>i && pattern.indexOf(check[j]) < 0){
                j--;
            }
            char temp = check[i];
            check[i] = check[j];
            check[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(check);
    }

    public static void main(String[] args) {
        String s = "ai";
        System.out.println(reverseVowels2(s));
    }
}
