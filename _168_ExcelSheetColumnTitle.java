public class _168_ExcelSheetColumnTitle {
    public static String convertToTitle(int columnNumber) {
        StringBuilder res = new StringBuilder();
        while(columnNumber > 0){
            char c = (char) (--columnNumber%26+'A');
            res.append(c);
            columnNumber/=26;
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }
}
