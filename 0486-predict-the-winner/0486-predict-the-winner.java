class Solution {
    public int predict4real(int i , int j , int  nums[] ){
        if(i>j) return 0;
        if(i==j) return nums[i];
        int takel = nums[i] + Math.min(predict4real(i+2, j , nums),predict4real(i+1, j-1 , nums));
        int taker = nums[j] + Math.min(predict4real(i, j-2 , nums),predict4real(i+1, j-1 , nums));
        return Math.max(takel,taker);
    } 
    public boolean predictTheWinner(int[] nums) {
        int i =0; 
        int j = nums.length-1;
        int total = Arrays.stream(nums).sum();
        int p1 = predict4real(0,j,nums);
        int p2 = total-p1;
        return p1>=p2;
    }
}