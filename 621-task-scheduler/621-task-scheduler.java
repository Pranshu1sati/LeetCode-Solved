class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer> mp = new HashMap<>();
        for(char c : tasks){
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(((a,b)->b-a));
        maxHeap.addAll(mp.values());
        int cycles =0;
        while(!maxHeap.isEmpty())
        {
            List<Integer> temp = new ArrayList<>();
            for(int i =0;i<n+1;i++){
                if(!maxHeap.isEmpty())
                    temp.add(maxHeap.remove());
            }
        
        for(int i:temp){
            if(--i>0)
                maxHeap.add(i);
        }
        cycles+=maxHeap.isEmpty()?temp.size():n+1;
            }
        return cycles;
    }
    
}