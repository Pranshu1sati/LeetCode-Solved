class Solution {
public List<List<Integer>> threeSum(int[] nums) {
        // Arrays.sort(nums);
         List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int i = 0 ;
        while( i < nums.length ){
            if( nums[i] > 0 )
                break;
            int j = i + 1 ;
            int k = nums.length - 1 ;
            while( j < k ){
                int sum = nums[i] + nums[j] + nums[k];
                if( sum == 0 ){
                    res.add(Arrays.asList(nums[i] , nums[j] , nums[k]));
                    while( j < k && nums[k--] == nums[k-1] ){}
                    while( ++j < k && nums[j] == nums[j-1] ){}
                }else if(sum > 0){
                    k--;
                }else{
                    j++;
                }
            }
            while( ++i < nums.length && nums[i] == nums[i-1] ){}
        }

        return res;

    }
}