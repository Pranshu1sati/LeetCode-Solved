class Solution {
    public boolean isSubsequence(String s, String t) {
     if(s.length() == 0) return true;
        
        if(s.length() > t.length() || s.length() == t.length() && !s.equals(t) || s.length() == t.length()) return false;

        int j = 0, i = 0;
        while(i < s.length() && j < t.length()) {
            if(s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        if(i == s.length()) return true;
        return false;
    }
}