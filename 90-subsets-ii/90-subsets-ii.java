class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        
        subset(0,  nums, nums.length, new ArrayList<>());

        return ans;  
    }
    public void subset(int i, int nums[], int n, List<Integer> curr){
        if(i == n ){
            if(ans.contains(curr)){
                return;
            }
            else{
                ans.add(new ArrayList<>(curr));
            }
            return;
        }
        subset(i+1, nums, n,curr);
        curr.add(nums[i]);
        subset(i+1, nums, n, curr );
        curr.remove(curr.size()-1);
        
    }
}