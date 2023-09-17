class Solution {
    public int search(int[] nums, int target) {
        int l = nums.length-1;
        int r =0;
        int mid;
        while(l>=r){
        mid = r + (l-r)/2;
        if(nums[mid] == target) return mid;
        else if( nums[mid]>target) l = mid-1;
        else r = mid+1;
        }
        return -1;
    }
}