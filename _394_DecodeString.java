import java.util.Stack;

public class _394_DecodeString {
    public static String decodeString(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if(c == ']'){
                //pop until meet '['
                StringBuilder loopStr = new StringBuilder();
                while(stack.peek() != '['){
                    loopStr.insert(0, stack.pop());
                }
                stack.pop(); //remove '['

                //get number
                StringBuilder numberStr = new StringBuilder();
                while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                    numberStr.insert(0, stack.pop());
                }
                int nLoop = Integer.parseInt(numberStr.toString());

                //repeat loopStr
                loopStr = new StringBuilder(loopStr.toString().repeat(nLoop));

                //add loopStr back to Stack
                for (char ch : loopStr.toString().toCharArray()) {
                    stack.push(ch);
                }
            }else{
                stack.push(c);
            }
        }
        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()){
            result.insert(0, stack.pop());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        System.out.println(decodeString(s));
    }
}
