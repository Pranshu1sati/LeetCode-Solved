class Solution {
    public int numDecodings(String s) {
        //121
        //12 1, 1 21, 1,2,1
        //226 22,6 2,26,2,2,6
        // singel digit sould be grater than 1 
        // dobel digit if fort digit is 1 should start with 1 end with 19,
        //121 1 ke bada 21 ko kese 
        int[]dp = new int[s.length()]; 
        Arrays.fill(dp,-1);
        return dfs(s,0,dp);
        
    }
    public int dfs(String str, int index, int[] dp) {
        if (index == str.length())
            return 1;
        if (str.charAt(index) == '0')
            return 0;
        if (dp[index] != -1) return dp[index];
        int val = dfs(str, index + 1, dp);
        if (index < str.length() - 1 && (str.charAt(index) == '1'
                || str.charAt(index) == '2'
                && str.charAt(index + 1) < '7')) {
            val += dfs(str, index + 2, dp);
        }
        return dp[index] = val;
    }
}