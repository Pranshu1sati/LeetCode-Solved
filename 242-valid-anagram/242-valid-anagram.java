class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {return false;}
        HashMap<Character,Integer> charcnt = new HashMap<>();
        for( char c : s.toCharArray()){
            charcnt.put(c,charcnt.getOrDefault(c,0)+1);
        }
        for( char c : t.toCharArray()){
            charcnt.put(c,charcnt.getOrDefault(c,0)-1);
        }
        boolean flag = true;
        for(char key : charcnt.keySet()){
                if(charcnt.get(key)!=0) flag = false;
            }
        return flag;
    }
}