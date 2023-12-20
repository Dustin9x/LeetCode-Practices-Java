public class _2706_BuyTwoChocolates {
    public static int buyChoco(int[] prices, int money) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<=min){
                secondMin = min;
                min = prices[i];
            }else if(prices[i] <= secondMin){
                secondMin = prices[i];
            }
        }
        System.out.println(min);
        System.out.println(secondMin);
        return (min+secondMin > money) ? money : (money - (min+secondMin));
    }

    public static void main(String[] args) {
        int[] prices = {69,91,78,19,40,13};
        System.out.println(buyChoco(prices,94));
    }
}
