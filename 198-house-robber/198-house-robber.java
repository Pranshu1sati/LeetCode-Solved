class Solution {
    public int rob(int[] nums) {
        int var1 = 0;
        int var2 = 0;
        
        for(int i=0; i<nums.length; i++){
            int temp = var1;
            var1 = Math.max(var1,nums[i]+var2);
            var2 = temp;
        }
        return var1;
    }
}