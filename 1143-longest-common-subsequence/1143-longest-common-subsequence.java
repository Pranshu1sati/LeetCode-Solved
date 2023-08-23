class Solution {
    public int lcs4real(String t1, String t2 ,int m ,int n, int[][]dp){
        if(n==0||m==0)return 0;
        if(dp[m][n] !=-1) return dp[m][n];
        if(t1.charAt(m-1)==t2.charAt(n-1)) {
            return dp[m][n] =  1+lcs4real(t1,t2,m-1,n-1,dp);}
        else{ 
            dp[m][n] = Math.max(lcs4real(t1,t2,m-1,n,dp),
                                lcs4real(t1,t2,m,n-1,dp));
             return dp[m][n];
        }
    }
    public int longestCommonSubsequence(String t1, String t2) {
        int m = t1.length();
        int n = t2.length();
        int dp[][] = new int [m+1][n+1];
        for (int[] row : dp) {
         Arrays.fill(row, -1); 
        }
         return lcs4real(t1,t2,m,n,dp);
    }
}