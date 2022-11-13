class Solution {
    
    
    

//Greedy    
//     public int minCostClimbingStairs(int[] cost) {
        
//         // Finding Min Of Last Two Element And Adding It With Current Element
//         for(int i=2; i<cost.length; i++){
//             cost[i] += Math.min(cost[i-1], cost[i-2]);
//         }
        
//         // Returning The Minimum Of Last 2 Modified Element
//         return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
        
//     }
// }

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int[n+1];
         
        dp[n] = 0;
        dp[n-1]=cost[n-1];

        for (int i = cost.length - 2; i >=0; i--) {
            dp[i] = cost[i] + Math.min(dp[i + 1], dp[i + 2]);
        }

        return Math.min(dp[0],dp[1]);
    }
}
