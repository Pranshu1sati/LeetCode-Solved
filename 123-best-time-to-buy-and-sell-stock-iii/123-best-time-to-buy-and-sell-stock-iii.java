class Solution {
    public int maxProfit(int[] prices) {
        // prices 3 3 5 0 0 3 1 4
       // left    0 0 2 2 2 3 3 4
      //  right   4 4 4 4 4 3 3 0 
        int P=0;
        if(prices.length==0) return 0;
        int []right = new int [prices.length];
        int []left = new int [prices.length];
        // left[0]=0;
        // left[prices.length-1]=0;
        int min = prices[0];
        for(int i=1;i<prices.length;i++){
            // left[i]=Math.max(prices[i]-prices[i-1],left[i-1]);
        //0   0   2  2  2  3  3  4 
            //0//2//2//2//3//3//3
            if(prices[i]<min) min = prices[i];
            int pro = prices[i]-min;
            left[i]=Math.max(left[i-1],pro);
            System.out.print(left[i]);
        }
        int max = prices[prices.length-1];
        for(int i=prices.length-2;i>=0;i--){
        if (prices[i]>max)max=prices[i];
            int profit = max-prices[i];
            right[i] = Math.max(profit,right[i+1]);
    }
        for(int i =0 ;i<prices.length;i++){
            P=Math.max(P,left[i]+right[i]);
        }
        return P;
    }
}