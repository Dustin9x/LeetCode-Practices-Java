import java.util.Stack;

public class _20_ValidParentheses {
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) { //ko push duoc phan tu nao
                    return false;
                } else {
                    if ((c == ')' && stack.peek() == '(')
                            || (c == ']' && stack.peek() == '[')
                            || (c == '}' && stack.peek() == '{')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "([}}])";
        System.out.println(isValid(s));
    }
}
