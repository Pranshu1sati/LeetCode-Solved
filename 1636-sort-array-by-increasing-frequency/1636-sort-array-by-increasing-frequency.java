class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int n:nums){
            mp.put(n,mp.getOrDefault(n,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->mp.get(a) == mp.get(b) ? b - a :mp.get(a)-mp.get(b));
        for(int key: mp.keySet()){
            pq.add(key);
        }
        int[] result=new int[nums.length];
        int count=0;
        while(pq.size() >0){
            int data=pq.poll();
            int freq=mp.get(data);
            while(freq!=0){
                result[count++]=data;
                freq--;
            }        
        }
        return result;
    }
    
}