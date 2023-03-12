class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> mp = new HashMap<>();
        int i=0;
        for(char c : key.toCharArray()){
            if(c==' '|| mp.containsKey(c)){
                continue;
            }
            else
                mp.put(c,(char)('a'+(i++)));
        }
        StringBuilder sb= new StringBuilder();
        for(char c : message.toCharArray()){
            sb.append((c==' ')? " ": mp.get(c));
        }
        return sb.toString();
    }
}