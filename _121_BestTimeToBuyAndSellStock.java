public class _121_BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int buy = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[buy] > prices[i]) buy = i;
            profit = Math.max(profit, prices[i] - prices[buy]);
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int[] prices2 = {7,6,4,8,3,1,4};
        System.out.println(maxProfit(prices2));
    }
}
