class Solution {
    public int maxProfit(int[] prices) {
        int bp= Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i < prices.length; i++)
        {
            if(bp<prices[i])
            {
                int currprofit = (prices[i]-bp);
                maxprofit=Math.max(currprofit,maxprofit);             
            }
            else
            {
                bp=prices[i];
            }
        }
        return maxprofit;
    }
}