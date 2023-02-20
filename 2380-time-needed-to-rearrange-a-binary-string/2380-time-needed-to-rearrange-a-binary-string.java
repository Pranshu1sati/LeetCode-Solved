class Solution {
    public int secondsToRemoveOccurrences(String s) {
        int cnt=0;
        while(true){
            int idx=s.indexOf("01");
            if(idx==-1)break;
            else{
                s=s.replaceAll("01","10");
                cnt++;
            }
        }
        
        return cnt;
    }
}