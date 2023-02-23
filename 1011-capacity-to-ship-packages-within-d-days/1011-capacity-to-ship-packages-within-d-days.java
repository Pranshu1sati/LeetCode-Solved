class Solution {
    public int shipWithinDays(int[] wt, int days) {
        /* the minimal capacity will be the max value in the weights array*/
        int low = 0;
        int high = 0;
        int ans =0;
        for(int w : wt) { 
            high += w;
            low = Math.max(low,w);
        }
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(isDaysBiggerThanExpected(wt,mid,days)) {
                low = mid + 1;
            }
            else {
                high = mid -1;
            }
        }
        return low;
    }

    private boolean isDaysBiggerThanExpected(int[] wt, int mid,int required) {
        int days = 1;
        int sum = 0;
        for(int w : wt) {
            if(sum + w > mid) {
                days++;
                sum = 0;
            }
            sum+= w;
        }
    if(days > required) {
        return true;
    }
    return false;
    }
}