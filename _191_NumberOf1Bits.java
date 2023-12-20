public class _191_NumberOf1Bits {
    public static int hammingWeight(int n) {
        String str = Integer.toBinaryString(n);
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(00000000000000000000000000001011));
    }
}
