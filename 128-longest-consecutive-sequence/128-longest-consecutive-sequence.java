class Solution {

    public int longestConsecutive(int[] nums) {
       int N=nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<N;i++){
            set.add(nums[i]);
        }
        int ans=0;
        for(int i=0;i<N;i++){
            if( !set.contains(nums[i]-1) )
            {
                int val = nums[i]+1;
                while(set.contains(val)) val++;
                ans=Math.max(ans, val-nums[i]);
            }
        }
        return ans;
    }
}