class Solution {
    public int countAsterisks(String s) {
boolean bar= false;
        int cnt=0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='*'&&bar==false)cnt++;
            if(s.charAt(i)=='*'&&bar==true)continue;
            if(s.charAt(i)=='|') bar= !bar;
    }
        return cnt;
}
}