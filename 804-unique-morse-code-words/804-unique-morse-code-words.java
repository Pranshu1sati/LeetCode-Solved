class Solution {
        String[] morse ={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set =new HashSet<>();
        for(String  w: words)
        {
            StringBuilder sb = new StringBuilder();
            for(char c : w.toCharArray()){
                sb.append(morse[c-'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}