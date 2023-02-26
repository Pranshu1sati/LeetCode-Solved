class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer,Integer> map = new HashMap();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        
        PriorityQueue<Integer> pq=new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        for(int key : map.keySet()){
            pq.add(key);
            if(pq.size()>k) pq.poll();
        }
        int[] result = new int[k];
        for(int i = k - 1; i >= 0; i--) {
            result[i] = pq.poll();
        }
        return result;
    }
}