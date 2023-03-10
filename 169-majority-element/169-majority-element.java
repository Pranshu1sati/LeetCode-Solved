class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int n: nums){
            if(mp.containsKey(n)) mp.put(n,mp.get(n)+1);
            else
                mp.put(n,1);
        }
        int x=0;
         Set<Integer> keys = mp.keySet();
            for(Integer key : keys){
                if(mp.get(key)> nums.length/2) x=key;
            }
     return x;
    }
}