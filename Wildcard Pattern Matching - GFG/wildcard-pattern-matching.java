//{ Driver Code Starts
import java.util.*;

class WildcardPattern
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String pat = sc.nextLine();
			String text = sc.nextLine();
			Solution g = new Solution();
			System.out.println(g.wildCard(pat,text));
			t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    boolean solve(String p, String s){
        int n = s.length();
        int m = p.length();
        boolean [][] dp = new boolean [n+1][m+1];
        dp[0][0] = true;
        //p=''
        for(int i=1; i<n+1; i++ ){
            dp[i][0] = false;
        }
        //s=''
    for(int j = 1; j <= m; j++){
        if(p.charAt(j-1)=='*') dp[0][j] = dp[0][j-1];
    }
    //
    for(int i = 1 ; i <= n; i++){
        for(int j = 1; j <= m; j++){
            if(p.charAt(j-1) == '*'){
                dp[i][j] = dp[i-1][j] || dp[i][j-1];
            } else if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?'){
                dp[i][j] = dp[i-1][j-1];
            } else {
                dp[i][j] = false;
            }
        }
    }
    return dp[n][m];
    }
    int wildCard(String pattern, String str)
    {
        // Your code goes here
        return solve(pattern,str) ? 1 : 0;
    }
}
