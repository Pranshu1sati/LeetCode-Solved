class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer>pq = new PriorityQueue<>((Integer a,Integer b)->{
           if(Math.abs(a - x) == Math.abs(b-x))return b-a;
           return Math.abs(b - x) -Math.abs(a-x);
       });
     
      for(int element:arr){
           pq.add(element);
           if(pq.size()>k)pq.poll();
       }
       List<Integer>res=new ArrayList<>();
       while(!pq.isEmpty()){
           res.add(pq.poll());
           }
           Collections.sort(res);
           return res;
           }
}