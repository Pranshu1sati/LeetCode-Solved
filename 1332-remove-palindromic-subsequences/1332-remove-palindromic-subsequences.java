class Solution {
    public int removePalindromeSub(String s) {
        //sliding window not fixed
        int r =0;
        int l = s.length()-1;
        while(r<l){
            if(s.charAt(r)!=s.charAt(l)) return 2;
            r++;
            l--;
        }return 1;
    }
}