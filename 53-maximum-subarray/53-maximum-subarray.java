class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int curr =0;
        for(int n : nums){
            curr = Math.max(curr,0);
            curr+=n;
            max = Math.max(max,curr);
        }
        return max;
    }
}