import java.util.Stack;

public class _344_ReverseString {
    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while(i <= j) {
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
            i++;
            j--;
        }
    }

    //cach 2
    public static void reverseString2(char[] s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<s.length;i++){
            stack.push(s[i]);
        }
        for(int i = 0;i<s.length;i++){
            s[i] = stack.peek();
            stack.pop();
        }
    }

    public static void main(String[] args) {
        char[] JavaCharArray = {'a', 'b', 'c', 'd', 'e'};
        reverseString2(JavaCharArray);
        for (char c:JavaCharArray) {
            System.out.print(c);
        }
    }
}
