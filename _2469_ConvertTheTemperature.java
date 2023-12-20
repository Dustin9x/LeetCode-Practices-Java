import java.util.Arrays;

public class _2469_ConvertTheTemperature {
    public static double[] convertTemperature(double celsius) {
        double[] res = new double[2];
        res[0] = celsius+273.15;
        res[1] = celsius*1.8+32;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(convertTemperature(36.5)));
    }
}
