class Solution {
    
    public void solve(int index, int [] cookies, int [] ans, int []temp, int k){
        int mx = temp[0];
        if(index >= cookies.length){
            for(int i =1; i < temp.length; i ++){
                mx = mx > temp[i] ? mx : temp[i];
            }
            ans[0] = ans[0] > mx ? mx :ans[0];
        }
        if(ans[0] <= mx) return;
        for(int i = 0; i < temp.length; i ++){
            temp[i] += cookies[index];
            solve(index + 1, cookies, ans, temp, k);
            temp[i] -= cookies[index];
        }
    }
    
    public int distributeCookies(int[] cookies, int k) {
        
        
        int ans [] = new int[1];
        int temp[] = new int[k];
        int sm = 0;
        for(int i=0; i < cookies.length; i++) sm += cookies[i];
        ans[0] = sm;
        solve(0, cookies, ans, temp, k);
        return ans[0];
    }
}