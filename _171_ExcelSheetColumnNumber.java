public class _171_ExcelSheetColumnNumber {
    public static int titleToNumber(String columnTitle) {
        int base = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            base*=26;
            base+=columnTitle.charAt(i) - 'A' + 1;
        }
        return base;
    }

    public static void main(String[] args) {
        String n = "AB";
        titleToNumber(n );
    }
}
