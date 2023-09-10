class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] nums) {
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i =0; i<nums.length-1; i++){
            int diff = nums[i+1] - nums[i];
            System.out.println(i+"  "+diff);
            if(diff<minDiff) {
                minDiff = diff;
                ans.clear();
                ans.add(Arrays.asList(nums[i],nums[i+1]));
            }
            else if(diff==minDiff){
              ans.add(Arrays.asList(nums[i],nums[i+1]));
            }
        }
        return ans;
    }
}