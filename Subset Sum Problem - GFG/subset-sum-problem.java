//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{


    static Boolean isPresent(int N, int arr[], int sum, Boolean[][] memo){
        // if(sum == 0) return true;
        // if(N==0) return false;
        // if(arr[N-1]>sum) return isPresent(N-1, arr, sum);
     
        // return isPresent( N-1,  arr,  sum)||isPresent(N-1, arr, sum-arr[N-1]);
        if (sum == 0) {
            return true;
        }
        if (N == 0) {
            return false;
        }
        if (memo[N][sum] != null) {
            return memo[N][sum];
        }
        if (arr[N - 1] > sum) {
            memo[N][sum] = isPresent(N - 1, arr, sum, memo);
        } else {
            memo[N][sum] = isPresent(N - 1, arr, sum, memo) || isPresent(N - 1, arr, sum - arr[N - 1], memo);
        }
        return memo[N][sum];
        
    }
    static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        // return isPresent(N,arr,sum);
        Boolean[][] memo = new Boolean[N + 1][sum + 1];
        return isPresent(N, arr, sum, memo);

    }
}