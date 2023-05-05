class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        //              123     
        helper(0 , ans, nums,curr);
        return ans;
    }
    public void helper(int itr, List<List<Integer>> ans, int[] nums, List<Integer> curr){
        if(itr == nums.length ){
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        curr.add(nums[itr]);
        
         helper(itr+1,ans,nums,curr);
            // remove the element and do the backtracking call.
         curr.remove(curr.size() - 1);
         helper(itr+1,ans,nums,curr);
    }
}