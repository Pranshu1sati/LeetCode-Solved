class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l =0;
        int r =0;
        //[2,3,1,2,4,3]
        int n = nums.length;
        int sum =0;
        int res = Integer.MAX_VALUE;
        while(r<n){
            sum += nums[r];
            while(sum>=target){
                res = Math.min(res,r-l+1);
                sum-=nums[l];
                l+=1;
            }
            r++;
        }
        return res == Integer.MAX_VALUE ?  0 : res;
    }
}