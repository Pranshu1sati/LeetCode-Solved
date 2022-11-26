class Solution {
    public int[] twoSum(int[] nums, int target) {
        int p1=0;
        int p2= nums.length-1;
        while(p1<p2)
    {
            if(nums[p1]+nums[p2]==target)
                return new int [] {p1+1,p2+1};
            
        else if(nums[p1]+nums[p2]>target){
            p2--;
        }
        else
            p1++;
    }
        return new int[] {};
    }
}