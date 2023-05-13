class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> s = new HashMap<>();
        for( int n : nums){
            if(s.containsKey(n)) return true;
            else
                s.put(n,0);
        }
        return false;
    }
}