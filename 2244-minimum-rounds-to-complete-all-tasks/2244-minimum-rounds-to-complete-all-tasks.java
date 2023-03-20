class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int a : tasks){
            mp.put( a , mp.getOrDefault(a,0)+1);
            
        }
        int res=0;
        for(int freq : mp.values()){
            if(freq==1) return -1;
            res += (freq + 2) / 3;
        }
        return res;
    }
}