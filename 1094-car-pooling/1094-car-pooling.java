class Solution {
    public boolean carPooling(int[][] trips, int capacity)
    {
         // Sort the trips based on pickup location
        // create 2 jobs from 1 job
        /*pickup and drop
        input [2,1,5],[3,3,7]
                x1 = [2,1,5]=[1,1,2],[5,0,2]        
                x2 =[3,3,7]= [3,1,3],[7,0,3]        
        */
        Arrays.sort(trips, (a, b) -> a[1] - b[1]);
        List<int[]> l = new ArrayList<>();
        for (int i = 0; i < trips.length; ++i) {
        l.add(new int[] {trips[i][1], 1, trips[i][0]});
        l.add(new int[] {trips[i][2], 0, trips[i][0]});
    }
    Collections.sort(l, (a, b) -> a[0] - b[0]);
         int curr = 0;
    for (int i = 0; i < l.size(); i++) {
        if (l.get(i)[1] == 1) curr += l.get(i)[2]; 
         if(l.get(i)[1]==0) curr-=l.get(i)[2];
        if (curr > capacity) return false;
    }
    return true;
    }
}
