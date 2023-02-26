class Solution {
    public int minimumOperations(int[] nums) {
         List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 && !list.contains(nums[i])) {
                list.add(nums[i]);
            }
        }
        return list.size();
    }
}