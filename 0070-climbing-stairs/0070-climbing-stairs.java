class Solution {
    public int climbStairs(int n) {
     //    if(n==0) return 1;
     //    if(n<0) return 0;
     // return climbStairs(n-1)+climbStairs(n-2);
        int dp[] = new int[n+1];//0 1 2 3 4 5
            dp[n]=1;             // 8 5 3 2 1 1
            dp[n-1]=1;
            for(int i=n-2; i>=0;i--){
                dp[i] = dp[i+1]+dp[i+2];
            }
            return dp[0];
    }
}
