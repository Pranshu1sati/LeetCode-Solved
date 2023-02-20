class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(k+1);
        
        for(int n:nums){
            pq.add(n);
            if(pq.size()>k){
                pq.remove();
            }
        }
        
        return pq.remove();
    }
}