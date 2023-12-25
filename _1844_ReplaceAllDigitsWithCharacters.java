public class _1844_ReplaceAllDigitsWithCharacters {
    public static String replaceDigits(String s) {
        char[] arr = s.toCharArray();
        for (int i = 1; i < arr.length; i+=2) {
            arr[i] = (char) ( arr[i-1] + arr[i] - '0');
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        String s = "a1b2c3d4e";
        System.out.println(replaceDigits(s));
    }
}
