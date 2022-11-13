class Solution {
    public int rob(int[] nums) {
        int p1 = 0;
        int p2 = 0;
        
        for(int i=0; i<nums.length; i++){
            int temp = p1;
            p1 = Math.max(p1,nums[i]+p2);
            p2 = temp;
        }
        return p1;
    }
}