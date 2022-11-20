class Solution {
   int[][] t;
   public int[][] outerTrees(int[][] t) {
       // Trivial case
       if(t.length<3) return t;
       this.t=t;
       int index=0;
       // Find lowest point
       int l = Integer.MAX_VALUE;
       for(int i=0; i<t.length;i++) if(t[i][1]<l) l=t[index=i][1];
       // Add lowest points first, if more than one the one in the left
       for(int i=0; i<t.length;i++) if(t[i][1]==l&&t[i][0]<t[index][0]) index=i;
       List<int[]> rope = new ArrayList<>();
       rope.add(t[index]);
       int next = index;
 
       do {
           int candidate;
           for(candidate=0;candidate<t.length-1;candidate++) if(candidate!=next) break;
           // Find farthest clockwise point
           for(int i=0; i<t.length;i++) {
               if(i==next||i==candidate) continue;
               int c = isAClockwiseB(next, i, candidate);
               if(c==0) candidate = farthestPoint(next,i,candidate);
               else if(c<0) candidate = i;
           }
           // Add all the points with the same slope in the middle, the order doesnt matter.
           final int f = next;
           for(int i=0; i<t.length;i++) if(i!=next&&i!=candidate&&isAClockwiseB(next, i, candidate)==0) rope.add(t[i]);
           // Add farthest point and set as base for next iteration
           next=candidate;
           rope.add(t[next]);
           // Stop if all the points are added. This only happens is all the points are on the edge
       } while(next!=index&&rope.size()<t.length);
       int size = next==index?rope.size()-1:rope.size();
       int[][] resp = new int[size][];
       for(int i=0;i<size;i++) resp[i] = rope.get(i);
       return resp;
   }
 
   int isAClockwiseB(int base, int a, int b) {
       int vax = t[a][0]-t[base][0], vay = t[a][1]-t[base][1];
       int vbx = t[b][0]-t[base][0], vby = t[b][1]-t[base][1];
       int m = (vay)*(vbx);
       int n = (vby)*(vax);
       if(m>n) return 1;
       if(m<n) return -1;
       return 0;
   }
 
   int farthestPoint(int base, int a, int b) {
       if(t[a][0]==t[base][0]) {
           if(Math.abs(t[a][1]-t[base][1])>Math.abs(t[b][1]-t[base][1])) return a;
       } else if(Math.abs(t[a][0]-t[base][0])>Math.abs(t[b][0]-t[base][0])) return a;
       return b;
   }
}