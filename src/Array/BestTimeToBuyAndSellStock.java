package Array;

public class BestTimeToBuyAndSellStock {

    /* TODO : d1   d2  d3  d4  d5  d6
            7   1   5   3   6   7
    */

    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                int potentialProfit = price - minPrice;
                if (potentialProfit > maxProfit) {
                    maxProfit = potentialProfit;
                }
            }
        }
        return maxProfit;
    }

}
