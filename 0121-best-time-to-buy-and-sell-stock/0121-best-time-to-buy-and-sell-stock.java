class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;  // lowest price seen so far
        int maxProfit = 0;                 // best profit seen so far

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;          // update minimum buying price
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice); // potential profit
            }
        }

        return maxProfit;
    }
}
