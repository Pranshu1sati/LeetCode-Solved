class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int n : stones){
            pq.add(n);
        }
        int x=0;
        int y=0;
        while(pq.size()>1){
            y=pq.remove();
            x=pq.remove();
            if(y>x){
                pq.add(y-x);
            }
        }
        return pq.isEmpty() ? 0 : pq.remove();
    }
}