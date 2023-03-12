class Solution {
    public int balancedStringSplit(String s) {
        int rC=0,lC=0;
        int total =0;
        for(int i =0; i< s.length();i++){
            if(s.charAt(i)=='R')
                rC++;
            if(s.charAt(i)=='L')
                lC++;
            if(lC==rC)
                total++;
        }
        return total;
    }
}