class Solution {
    public boolean wordPattern(String pattern, String s) {
         String[] sArray = s.split("\s");
        if(sArray.length != pattern.length()) {
            return false;
        }
        HashMap<String,Character > w2c = new HashMap<>();
        HashMap<Character, String> c2w = new HashMap<>();
         for (int i = 0; i < pattern.length(); i++) {
        
            if(c2w.containsKey(pattern.charAt(i)) && !c2w.get(pattern.charAt(i)).equals(sArray[i])) {
                return false;
            }
            
            if(w2c.containsKey(sArray[i]) && !w2c.get(sArray[i]).equals(pattern.charAt(i))) {
                return false;
            }
            
            c2w.put(pattern.charAt(i),sArray[i]);
            w2c.put(sArray[i],pattern.charAt(i));
        }
        return true;
    }
}