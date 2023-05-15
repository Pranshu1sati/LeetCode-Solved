class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 2;
        for(int i=2 ; i<nums.length;i++){
            if(nums[i]!=nums[l-2]){
                nums[l]= nums[i];
                l++;
            }
        }
        return l;
    }
}