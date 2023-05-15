class Solution {
    public int[] twoSum(int[] nums, int target) {
            // int ans[] = new int[2];
            HashMap<Integer,Integer> al = new HashMap<>();
        for(int i = 0 ; i< nums.length; i++){
            int n = target -nums[i];
            if(al.containsKey(n)){
                return new int[] {i,al.get(n)};
            }
            al.put(nums[i],i);
        }
        return new int[2];
    }
}
    