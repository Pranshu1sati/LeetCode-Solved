class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int idx=0;
        int count =0;
        if(ruleKey.equals("type")) idx =0;
        if(ruleKey.equals("color")) idx = 1;
        if(ruleKey.equals("name")) idx=2;
        for(int i =0; i<items.size();i++){
            if(items.get(i).get(idx).equals(ruleValue))
               {count++;}
        }
             return count;
    }
}