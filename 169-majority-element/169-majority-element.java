class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int n: nums){
            
                mp.put(n,mp.getOrDefault(n,0)+1);
        }
        int x=0;
         //Set<Integer> keys = mp.keySet();
            for(Integer key : mp.keySet()){
                if(mp.get(key)> nums.length/2) x=key;
            }
     return x;
    }
}