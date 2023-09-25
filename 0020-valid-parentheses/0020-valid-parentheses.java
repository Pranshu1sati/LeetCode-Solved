class Solution {
    public boolean isValid(String s) {
      while(s.length() != (s = s.replaceAll("\\(\\)|\\[\\]|\\{\\}","")).length());
        return s.isEmpty();
    }
}