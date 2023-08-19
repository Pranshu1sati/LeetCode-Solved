//{ Driver Code Starts
import java.io.*;
import java.util.*;

class RodCutting {

    public static void main(String args[])throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(s[i]);

            Solution ob = new Solution();
            out.println(ob.cutRod(arr, n));
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution{
     
    //  public int cutRod4real(int price[], int n ){
    //      //complete this function
    //      if(n==0) return 0;
         
    //  }
    private static int findMax(int[] value, int length, int i, int memo[] ) {
		if(length == 0 || i == length)
			return 0;
		if(length < 0)
			return Integer.MIN_VALUE;
		if(memo[length]!=0 ) return memo[length];
		int take = value[i] + findMax(value, length - i - 1, i, memo);
		int dontTake = findMax(value, length, i + 1, memo);
		
		memo[length] =  Math.max(take, dontTake);
		return memo[length];
	}
    
    public int cutRod(int prices[], int n) {
        //code 
        int memo[] = new int[n+1];
        
       return findMax(prices, n,0,memo );
    }
}