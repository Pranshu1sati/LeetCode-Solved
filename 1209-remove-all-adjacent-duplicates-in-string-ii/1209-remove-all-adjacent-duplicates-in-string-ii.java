class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair<Character, Integer>>  st = new Stack<>();
        for(Character ch :s.toCharArray()){
            if(st.isEmpty()) st.push(new Pair(ch, 1));
            else{
               Pair<Character, Integer> p = st.peek();
                if (p.getKey() == ch) {
                    if (p.getValue() == k-1) {
                        for (int i = 0; i < k-1; i++) {
                            st.pop();
                        }
                    } else {
                        st.push(new Pair(ch, p.getValue() + 1));
                    }
                } else {
                    st.push(new Pair(ch, 1));
                }
            }
        }
StringBuilder sb = new StringBuilder();
        
        while(!st.empty()) {
            Pair<Character, Integer> p = st.pop();
            sb.append(p.getKey());
        }
        
        return sb.reverse().toString();
    }
}