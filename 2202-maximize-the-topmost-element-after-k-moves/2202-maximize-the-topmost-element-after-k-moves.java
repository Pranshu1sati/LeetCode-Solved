class Solution {
    public int maximumTop(int[] nums, int k) {
        if (nums.length == 0) return -1;
        if (nums.length == 1&& k %2 == 1) return -1;
        if (k> nums.length) { // if k>nums.length just return the max of the array;
            int maxOfArray = 0;
            for (int i : nums) {maxOfArray = Math.max(maxOfArray, i);}
            return maxOfArray;
        }
         int max = 0;//for ans;

        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length-1; i >=0; i--) {
            stack.push(nums[i]);
        }
        int index = 0;
        while (index<k-1){
            max = Math.max(stack.pop(), max);

            index++;
        }
        if (k+1<= nums.length) max = Math.max(nums[k],max);
        return max;
    }
}