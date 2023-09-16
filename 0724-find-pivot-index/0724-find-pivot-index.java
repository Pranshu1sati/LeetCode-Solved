class Solution {
    public int pivotIndex(int[] nums) {
    // int i =0;
    int sum = Arrays.stream(nums).sum();
    int rightsum =0;
    int leftsum =0;
    for(int i=0; i<nums.length; i++){
       rightsum = sum - nums[i]- leftsum;
       if(leftsum == rightsum) return i;
       leftsum += nums[i];
    }
        return -1;
    }
}