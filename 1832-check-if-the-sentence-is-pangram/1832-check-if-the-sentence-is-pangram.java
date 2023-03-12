class Solution {
    public boolean checkIfPangram(String sentence) {
        char[]chr = sentence.toCharArray();
        
        HashMap<Character,Integer> m = new HashMap<>();
        for(char c : chr){
            m.put(c,m.getOrDefault(c,1)+1);
        }
        char arr[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(char c: arr){
            if(m.containsKey(c))
                continue;
            else 
                return false;
        }
        return true;
    }
}