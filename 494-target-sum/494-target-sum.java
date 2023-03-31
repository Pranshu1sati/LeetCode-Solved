class Solution {
    private int rec(int [] nums, int target, int i, int sum ){
        if(i==nums.length){
            return (sum==target) ? 1 : 0;
                }
        int pos = rec(nums, target, i+1, sum+nums[i]);
        int neg = rec(nums, target , i+1, sum-nums[i]);
        return pos +neg;
    }
    public int findTargetSumWays(int[] nums, int target) {
             
                 return rec(nums,target,0,0);
    }
}