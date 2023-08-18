class Solution {
    public int helper(int nums[], int start, int end){
         int prev2 = nums[start];
        int prev = Math.max(nums[start], nums[start+1]);
        for (int i = start+2; i < end; i++){
         int curr= Math.max(nums[i] + prev2, prev);
         prev2=prev;
         prev=curr;
        }
        
        return prev;
    }
    public int rob(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if (nums.length == 1) return nums[0];
        if(nums.length==2)
           { return Math.max(nums[0],nums[1]);}
        if(nums.length==3)
           {return Math.max(nums[1], Math.max(nums[0],nums[2]));}
        int m1 =helper(nums,0 , nums.length-1);
        int m2 = helper (nums , 1 , nums.length);
        return Math.max(m1,m2); 
    }
}