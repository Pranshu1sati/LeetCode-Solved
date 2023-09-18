class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int res [] = new int[nums.length];
        Arrays.fill(res,-1);
        int len = nums.length;
        Stack<Integer> stack = new Stack();
        for(int i=0; i<len; i++){
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i]){
                res[stack.pop()] = nums[i];
            }
            stack.push(i);
        }

        while(!stack.isEmpty() ){
            int item = stack.pop();
            for(int i=0; i<item; i++ ){
                if(nums[i] > nums[item]){
                    res[item] = nums[i];
                    break;
                }
            }
        }
        return res;
    }
}