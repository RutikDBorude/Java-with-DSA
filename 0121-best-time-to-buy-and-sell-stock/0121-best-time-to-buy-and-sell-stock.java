class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxprofit = 0;
        for(int price : prices){
            maxprofit = Math.max(maxprofit,price-min);
            if(price < min){
                min = price;
            }
        }
        return maxprofit;
    }
}