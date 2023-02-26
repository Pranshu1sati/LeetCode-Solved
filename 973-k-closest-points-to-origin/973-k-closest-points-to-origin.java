class Solution {
    public class Points implements Comparable<Points>{
      int x;
        int y;
        int dist;
        int idx;

        public Points(int x ,int y , int dist , int idx){
            this.x = x;
            this.y=y;
            this.dist = dist ;
            this.idx =idx;
        }
        @Override
        public int compareTo(Points p2){
            return this.dist - p2.dist;
        }
    }
    public int[][] kClosest(int[][] pts, int k) {
                PriorityQueue<Points> pq = new PriorityQueue<>();
               for(int i = 0 ; i< pts.length;i++){
                   int distSq = pts[i][0]*pts[i][0]+pts[i][1]*pts[i][1];
                   pq.add(new Points(pts[i][0],pts[i][1],distSq,i));
               }
        int arr[][] = new int[k][2];
            for(int i =0; i<k;i++){
                int j = pq.remove().idx;
                arr[i][0] = pts[j][0];
                arr[i][1] = pts [j][1];
            }
        return arr;
    }
}