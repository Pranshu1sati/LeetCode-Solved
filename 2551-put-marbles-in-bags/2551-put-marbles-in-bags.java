class Solution {
    public long putMarbles(int[] a, int k) {
        PriorityQueue<Integer> pmin = new PriorityQueue<Integer>();
    PriorityQueue<Integer> pmax = new PriorityQueue<Integer>(Collections.reverseOrder());
    
    int n = a.length;
    
    for(int i=1;i<n;i++)
    {
        int x = a[i] + a[i-1];
        
        pmin.add(x);
        pmax.add(x);
    }
    
    --k;
    
    long ans = 0;

    if(k == 0)
    {
        ans = 0;
    }
    else
    {
        long v1 = 0, v2 = 0;
        while(k > 0)
        {
            v1 += pmin.poll();
            v2 += pmax.poll();
            --k;
        }
        
        ans = v2 - v1;
    }
    
    return ans;
    }
}