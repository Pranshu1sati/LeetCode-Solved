//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading length of line segment
            int n = Integer.parseInt(read.readLine().trim());
            
            
            //reading 3 segment lengths
            String str[] = read.readLine().trim().split(" ");
            
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            int z = Integer.parseInt(str[2]);
            
            
            //calling method maximizeCuts() of class Solution()
            //and printinting the result
            System.out.println(new Solution().maximizeCuts(n, x, y, z));
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to find the maximum number of cuts.
public int maxcurRec(int n, int x, int y, int z, ArrayList<Integer> dp) {
    if (n == 0) return 0;
    if (n < 0) return -1;
    if (dp.get(n) != -1) return dp.get(n);
    
    int res = Math.max(
        maxcurRec(n - x, x, y, z, dp),
        Math.max(
            maxcurRec(n - y, x, y, z, dp),
            maxcurRec(n - z, x, y, z, dp)
        )
    );
    dp.set(n, (res == -1) ? -1 : res + 1);
    return dp.get(n);
}

public int maximizeCuts(int n, int x, int y, int z) {
    // ArrayList<Integer> dp = new ArrayList<>(Collections.nCopies(n + 1, -1)); // Size should be n + 1
    // return maxcurRec(n, x, y, z, dp);
       
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
       
    for (int i = 1; i <= n; i++) {
            if (i - x >= 0) dp[i] = Math.max(dp[i], dp[i - x]);
            if (i - y >= 0) dp[i] = Math.max(dp[i], dp[i - y]);
            if (i - z >= 0) dp[i] = Math.max(dp[i], dp[i - z]);

            if (dp[i] != -1) dp[i]++;
        }

        return Math.max(dp[n], 0);
    }
}
