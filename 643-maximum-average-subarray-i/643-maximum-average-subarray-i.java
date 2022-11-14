class Solution {
    public double findMaxAverage(int[] nums, int k) {
      
        double sum =0;
        double ans=0;
        int i=0;
       int n = nums.length;
            for(;i<k;i++)
            {
            sum+=nums[i];
            }
            ans=sum;
        int j=0;
      while(i<nums.length){
          sum-=nums[j++];
          sum+=nums[i++];
          ans=Math.max(ans,sum);
      }
        return ans/k;
    }
}