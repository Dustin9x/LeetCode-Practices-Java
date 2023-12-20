public class _1689_PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public static int minPartitions(String n) {
        int max = 0;

        for (char c: n.toCharArray()) {
            max = Math.max(max,c-'0');
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(minPartitions("82734"));
    }
}
