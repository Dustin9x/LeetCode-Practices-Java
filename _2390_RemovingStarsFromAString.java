import java.util.Objects;
import java.util.Stack;

public class _2390_RemovingStarsFromAString {
    public static String removeStars(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack();
        for(char c : s.toCharArray()) {
            if(c != '*' || stack.isEmpty()) {
                stack.push(c);
            } else {
                if(stack.peek() != '*') stack.pop();
            }
        }
        while(!stack.isEmpty()) {
            ans.append(stack.pop());
        }
        return ans.reverse().toString();
    }

    public static String removeStars2(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '*'){
                res.deleteCharAt(res.length()-1);
            }else{
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "erase***";
        System.out.println(removeStars2(s));
    }
}
