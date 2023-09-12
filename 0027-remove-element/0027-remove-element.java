class Solution {
    public int removeElement(int[] nums, int val) {
        int p1 =0;
        int p2 =1;
        for(int i =0; i<nums.length; i++){
            if(nums[i]!=val){
                nums[p1] = nums[i];
                p1+=1;
            }
        }
        return p1;
    }
}