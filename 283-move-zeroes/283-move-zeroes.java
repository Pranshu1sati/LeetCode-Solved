class Solution {
    public void moveZeroes(int[] nums) {
ArrayList<Integer> zero = new ArrayList<>();
        ArrayList<Integer> non = new ArrayList<>();
        for(int n : nums){
            if(n==0) zero.add(n);
            else non.add(n);
        }
        int i =0;
        for( ; i<non.size(); i++){
            nums[i] = non.get(i);
        }
        for(int j = 0; j < zero.size(); j++){
            nums[i++] = zero.get(j);
        }
    }
}