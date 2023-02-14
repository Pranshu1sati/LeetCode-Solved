class Solution {
    public int[] runningSum(int[] nums) {
        int x=0;
        for(int i = 1 ; i< nums.length;i++){
            nums[i] = nums[i]+nums[x];
            x++;
    }
        return nums;
    }
}