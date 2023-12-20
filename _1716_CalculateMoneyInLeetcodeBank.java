public class _1716_CalculateMoneyInLeetcodeBank {
    public static int totalMoney(int n) {
        int week = n/7;
        int day = n%7;
        int result = 0;
        for (int i = 0; i < week; i++) {
            result += 7*i+28;
        }
        for (int i = 0; i < day; i++) {
            result += i+1+week;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(totalMoney(20));
    }

}
