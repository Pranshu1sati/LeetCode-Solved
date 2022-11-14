class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length==1) return nums[0]/k;
        double sum =0;
        double ans=0;
        int j;
       int n = nums.length;
            for(j=0;j<k;j++)
            {
            sum+=nums[j];
            }
            ans= sum;
        for(int i=0; i< n-k; i++){
            sum=sum+nums[j++]-nums[i];
            ans = Math.max(sum,ans);
        }
        return ans/k;
    }
}