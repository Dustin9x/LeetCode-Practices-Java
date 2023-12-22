public class _709_ToLowerCase {
    public static String toLowerCase(String s) {
        StringBuilder res = new StringBuilder();
        for (char c: s.toCharArray()) {
            if(c >64 && c < 91) c = (char) (c+32);
            res.append(c);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(toLowerCase(s));
    }
}
