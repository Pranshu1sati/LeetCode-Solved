class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : score) {
            pq.add(i);
        }
        Map<Integer, String> mp = new HashMap<>();
        int i =1;
        while(!pq.isEmpty()){
            if(i==1){
                mp.put(pq.poll(),"Gold Medal");i++;
            }
             if(i==2){
                mp.put(pq.poll(),"Silver Medal");i++;
            }
             if(i==3){
                mp.put(pq.poll(),"Bronze Medal");i++;
            }
            else{
                mp.put(pq.poll(),Integer.toString(i));
                i++;
            }
            
        }
        String[] ans = new String[score.length];
        for (int j = 0; j < score.length; j++) {
            ans[j] = mp.get(score[j]);
        }
        return ans;
    }
}