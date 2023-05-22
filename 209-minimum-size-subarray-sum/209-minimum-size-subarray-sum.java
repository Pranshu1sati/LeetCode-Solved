class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i =0;
        int sum = 0;
        int ans =Integer.MAX_VALUE;
        for(int r =0 ; r< nums.length; r++){
            sum+=nums[r];
            while(sum>=target){
                ans = Math.min(r-i+1,ans);
                sum = sum-nums[i];
                i=i+1;
            }  
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}