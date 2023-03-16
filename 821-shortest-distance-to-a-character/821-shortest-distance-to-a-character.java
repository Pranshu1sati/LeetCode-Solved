class Solution {
    public int[] shortestToChar(String s, char c) {
       int N = s.length();
        int[] ans = new int[N];
        int prev = N + 1, j;
        for (int i = 0; i < N; ++i) {
            if (s.charAt(i) == c) {
                ans[i] = 0;
                prev = 1;
                j = i-1;
                while( j >= 0 && ans[j] > i - j ){
                    ans[j] = i - j;
                    j--;
                }
            }
            else
                ans[i] = prev++;
        }
    return ans; 
    }
}