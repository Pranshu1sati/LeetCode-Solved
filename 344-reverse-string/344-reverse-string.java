class Solution {
    public void reverseString(char[] s) {
        int n = s.length - 1;
        int st=0,e=n;
        while(st<e){
            char temp=s[st];
            s[st]=s[e];
            s[e]=temp; 
            st++;
            e--;
        }
    }
}