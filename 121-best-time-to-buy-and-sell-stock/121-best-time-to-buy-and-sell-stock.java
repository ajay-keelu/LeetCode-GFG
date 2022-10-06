class Solution {
    public int maxProfit(int[] prices) {
        int bypr = prices[0];
        int mxpr = 0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<bypr)
                bypr = prices[i];
            int profit = prices[i] - bypr;
            if(mxpr < profit)
                mxpr = profit;
        }
        return mxpr;
    }
}