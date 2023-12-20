public class _1678_GoalParserInterpretation {
    public static String interpret(String command) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if(command.charAt(i) == '(' && command.charAt(i+1)==')'){
                res.append('o');
                i++;
            } else if(command.charAt(i) != '(' && command.charAt(i)!=')') {
                res.append(command.charAt(i));
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String command = "G()(al)";
        System.out.println(interpret(command));
    }
}
