import java.util.ArrayList;
import java.util.List;

public class _401_BinaryWatch {

    public static int counBitOne(int num){
        int count = 0;
        while(num!=0){
            if((num & 1) == 1){
                count++;
            }
            num = num>>1;
        }
        return count;
    }
    public static List<String> readBinaryWatch(int turnedOn) {
        List<String> res = new ArrayList<>();

        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
                int totalBitCount = counBitOne(h) + counBitOne(m);
                if(totalBitCount == turnedOn){
//                    String time = String.format("%d:%02d",h,m);
//                    res.add(time);
                    StringBuilder sb = new StringBuilder();
                    sb.append(h);
                    sb.append(":");
                    if(m<10){
                        sb.append(0);
                    }
                    sb.append(m);
                    res.add(sb.toString());
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(readBinaryWatch(1));
    }
}
