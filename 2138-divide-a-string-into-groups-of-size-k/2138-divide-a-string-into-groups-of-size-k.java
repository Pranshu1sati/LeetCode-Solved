class Solution {
    public String[] divideString(String s, int k, char fill) {
        int size =0,rem=0;
        int len=s.length();
        if(len%k==0) size = len/k;
        else{
            rem=k-(len%k);
            size=len/k +1;
        }
        for(int i=0;i<rem;i++){
            s+=fill;
        }
        int start=0,end=k;
        String[] ans=new String[size];
        for(int i=0;i<size;i++){
            String temp=s.substring(start,end);
            ans[i]=temp;
            start=end;
            end+=k;
        }
        return ans;
    }
}