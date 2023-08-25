class Solution {
    public int lengthOfLIS(int[] nums) {
        TreeSet<Integer> hs = new TreeSet<>();
        for(int n : nums){
            hs.add(n);
        }
        for(int n : hs){
            System.out.print(n);
        }
        int []arr2 = new int[hs.size()];
        int i =0;
        for(int n : hs){
            arr2[i] = n;
            i++;
        }
        
    return lcs(nums, arr2);
    }
    private int lcs(int arr1[], int[]arr2){
        int n = arr1.length;
        int m = arr2.length;
        int dp [][] = new int[arr1.length+1][arr2.length+1];
        for(int i = 1; i<n+1; i++){
            for(int j = 1; j<m+1; j++){
                if(arr1[i-1] == arr2[j-1]) dp[i][j] = dp[i-1][j-1] +1;
                else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }
}