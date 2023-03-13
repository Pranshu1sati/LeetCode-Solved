class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int h : heights){
            pq.offer(h);
        }
         String[] res = new String[names.length];
        for(int j =0; j< res.length;j++){
            int h = pq.poll();
           for (int k = 0; k < heights.length; k++) {
                if (heights[k] == h) {
                    res[j] = names[k];
                    heights[k] = -1; // mark as visited
                    break;
                }
           }
        }
        return res;
    }
}