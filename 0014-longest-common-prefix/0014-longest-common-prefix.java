class Solution {
    class Trie{
        Trie[] children = new Trie[26];
        boolean eow = false;
        Trie(){
            for(int i =0; i<26; i++){
                children[i] = null;
            }
        }
    }
    public Trie root =  new Trie();
    public void insert (String key){
        Trie curr = root ; 
        for(int l = 0 ; l<key.length(); l++){
            int idx = key.charAt(l)-'a';
            if(curr.children[idx] == null) {
                curr.children[idx] = new Trie();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Insert all the words into the Trie
        for (String word : strs) {
            insert(word);
        }

        StringBuilder prefix = new StringBuilder();
        Trie curr = root;

        // Traverse the Trie to find the longest common prefix
        while (true) {
            int count = 0;
            int idx = -1;
            for (int i = 0; i < 26; i++) {
                if (curr.children[i] != null) {
                    count++;
                    idx = i;
                }
            }

            if (count != 1 || curr.eow) {
                break;
            }

            prefix.append((char) ('a' + idx));
            curr = curr.children[idx];
        }

        return prefix.toString();
    
    }
}