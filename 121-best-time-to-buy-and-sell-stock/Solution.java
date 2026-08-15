class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int dayBought = prices[0];

        for (int i = 0; i < prices.length; i++) {
            int costprice = prices[i];

            profit = Math.max(profit, costprice - dayBought);
            dayBought = Math.min(costprice, dayBought);
        }

        return profit;
    }
}