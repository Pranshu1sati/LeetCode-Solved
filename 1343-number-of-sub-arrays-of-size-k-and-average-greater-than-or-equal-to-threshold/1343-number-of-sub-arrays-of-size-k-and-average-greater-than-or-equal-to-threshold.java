class Solution {
    public int numOfSubarrays(int[] nums, int k, int t) {
        int sum = 0;
        int count = 0 ;
        for(int i = 0 ; i< k ; i++){
            sum+=nums[i];
        }
        if(sum/k>=t){
            count++;
        }
        for( int j = k ; j< nums.length;j++){
            sum-=nums[j-k];
            sum+=nums[j];
            if(sum/k>=t){
                count++;
            }
        }
        return count;
    }
}