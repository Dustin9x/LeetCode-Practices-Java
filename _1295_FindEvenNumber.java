public class _1295_FindEvenNumber {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for ( int i : nums) {
            if (getSize(i) % 2 == 0) {
                count ++;
            }
        }
        return count;
    }

    private static int getSize(int number) {
        int length = 0;
        long temp = 1;
        while (temp <= number) {
            length++;
            temp *= 10;
        }
        return length;
    }

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int numbers = findNumbers(nums);
        System.out.println(numbers);
    }
}
