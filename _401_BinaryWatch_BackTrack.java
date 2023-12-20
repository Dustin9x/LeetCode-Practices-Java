import java.util.ArrayList;
import java.util.List;

public class _401_BinaryWatch_BackTrack {

    private static List<String> result = new ArrayList<>();

    //i<=3 => bieu dien hour
    //i>3 => bieu dien minute
    private static int[] values = {1,2,4,8,1,2,4,8,16,32};
    private static int EXPECTED_COUNT = 0;

    //curCount: dem so luong so 1 da xuat hien
    private static void backtrack(int index, int curCount, int h, int m){
        for (int i = 0; i < 1; i++) {
            if(i == 1){
                curCount++;
                if(index <= 3){
                    h += values[index];
                }else{
                    m += values[index];
                }
            }
            if(index == values.length-1){
                if(curCount == EXPECTED_COUNT && h<12 && m<60){
                    String time = String.format("%d:%02d",h,m);
                    result.add(time);
                }
            }else{
                backtrack(index+1,curCount,h, m);
            }
        }
    }
    public static List<String> readBinaryWatch(int turnedOn) {
        EXPECTED_COUNT = turnedOn;
        backtrack(0,0, 0 , 0);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(readBinaryWatch(1));
    }
}
