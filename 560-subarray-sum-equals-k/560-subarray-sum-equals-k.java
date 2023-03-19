class Solution {
    public int subarraySum(int[] nums, int k) {
      HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0,1);
        int sum =0;
        int len = 0;
        for(int j =0; j<nums.length;j++)
        {
            sum +=nums[j];
            if(mp.containsKey(sum-k))
                len += mp.get(sum-k);
           
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return len;
    }
}