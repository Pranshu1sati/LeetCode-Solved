class Trie{
    TrieNode tNode;
    public Trie() {
        tNode = new TrieNode();
    }

    public void insert(String word) {
        tNode.insert(word);
    }

    public boolean search(String word) {
        return tNode.search(word);
    }

    public boolean startsWith(String prefix) {
        return tNode.startsWith(prefix);
    }
}
class TrieNode {

    TrieNode[] tNode;

    private boolean isEnd = false;

    public TrieNode() {
        tNode = new TrieNode[26];
    }

    public void insert(String word) {
        TrieNode node = this;
        for(int i = 0 ; i < word.length(); i++) {
            if(node.tNode[word.charAt(i) - 'a'] == null) {
                node.tNode[word.charAt(i) - 'a'] = new TrieNode();
            } 
            node = node.tNode[word.charAt(i) - 'a'];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        TrieNode node = this;
        for(int i = 0 ; i < word.length(); i++) {
            if( node.tNode[word.charAt(i) - 'a'] != null)
                node = node.tNode[word.charAt(i) - 'a'];
            else 
                return false;
        }
        return node.isEnd;
    }

    public boolean startsWith(String prefix) {
       TrieNode node = this;
       for(int i = 0 ; i < prefix.length(); i++) {
           if( node.tNode[prefix.charAt(i) - 'a'] != null)
                node = node.tNode[prefix.charAt(i) - 'a'];
            else 
                return false;
       }

       return true;
    }
}

