class Solution {
    // List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
    List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        //              123     
        helper(0 , ans, nums,curr);
        return ans;
    }
    public void helper(int i, List<List<Integer>> ans, int[] nums, List<Integer> curr){
        if(i== nums.length ){
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        curr.add(nums[i]);
        
         helper(i+1,ans,nums,curr);
            // remove the element and do the backtracking call.
         curr.remove(curr.size() - 1);
        
        while(i < nums.length - 1 && (nums[i] == nums[i + 1] ) )
        {
            i++ ;
        }
         helper(i+1,ans,nums,curr);
    }
}