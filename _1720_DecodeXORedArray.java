import java.util.Arrays;

public class _1720_DecodeXORedArray {
    public static int[] decode(int[] encoded, int first) {
        int[] res = new int[encoded.length+1];
        res[0] = first;
        for (int i = 1; i < res.length; i++) {
            res[i] = encoded[i-1] ^ res[i-1];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] encoded = {1,2,3};
        System.out.println(Arrays.toString(decode(encoded, 1)));
    }
}
