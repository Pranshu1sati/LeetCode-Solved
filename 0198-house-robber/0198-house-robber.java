class Solution {
    public int robRec(int[] nums, int n){
        if(n<0) {
            return 0;
        }
        if(n==0) return nums[n];
        int rob = nums[n] + robRec(nums, n-2);
        int dont = robRec(nums, n-1);
        return Math.max(rob , dont);
    }

    public int rob(int[] nums) {
        if (nums.length == 0)return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length==2) return Math.max(nums[0],nums[1]);
        // int prev1 = nums[0];
        //     int prev = Math.max(nums[0],nums[1]);
        // for(int i =2 ; i<nums.length;i++){
        //     int curr = Math.max(prev1+nums[i],prev);
        //     prev1=prev;
        //     prev = curr;
        // }
        // return prev;
        int prev1 = nums[nums.length-1];
        int prev2 = Math.max(nums[nums.length-1],  nums[nums.length-2]);
        for(int i=nums.length-3; i>=0; i-- ){
            int curr = Math.max(prev1 + nums[i], prev2);
            prev1 = prev2;
            prev2 = curr;
        }
        return prev2;
        // return robRec(nums, nums.length-1);
    }
}