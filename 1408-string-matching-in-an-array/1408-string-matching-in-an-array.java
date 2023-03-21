class Solution {
    public List<String> stringMatching(String[] words) {
         String str = String.join(" ", words);
        List<String> ans = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            if(str.indexOf(words[i]) != str.lastIndexOf(words[i])){
                ans.add(words[i]);
            }
        }
        return ans;
    }
}