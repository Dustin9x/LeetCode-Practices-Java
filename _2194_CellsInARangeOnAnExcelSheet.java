import java.util.ArrayList;
import java.util.List;

public class _2194_CellsInARangeOnAnExcelSheet {
    public static List<String> cellsInRange(String s) {
        List<String> res = new ArrayList<>();
        int row = s.charAt(1) - '0';
        int col = s.charAt(4) - '0';
        for (int i = s.charAt(0); i <= s.charAt(3) ; i++) {
            for (int j = row; j <= col; j++) {
                String str = String.valueOf((char) i)+j;
                res.add(str);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "A1:F1";
        System.out.println(cellsInRange(s));
    }
}
