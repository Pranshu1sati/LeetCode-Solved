class Solution {
    public int minStartValue(int[] nums) {
        int minsum = Integer.MAX_VALUE;
        int sum =0;
        for(int n : nums){
            sum+=n;
            minsum=Math.min(minsum,sum);
        }
        return  Math.max(1, 1 - minsum);
    }
}