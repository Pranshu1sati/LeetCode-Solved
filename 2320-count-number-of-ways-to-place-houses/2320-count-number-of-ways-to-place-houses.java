class Solution {
    public int countHousePlacements(int n) {
        long mod=1000000007;
      long dp[] =new long[n+1+1];
        dp[0]=1;
        dp[1]=2;
        dp[2]=3;
            for(int i=3; i<=n; i++)
            {
                dp[i]=(dp[i-1]+dp[i-2])%mod;
            }
        return (int)((dp[n]*dp[n])%mod);
            
}
}