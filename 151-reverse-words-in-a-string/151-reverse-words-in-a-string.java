class Solution {
    public String reverseWords(String s) {
        Stack<StringBuilder> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
         boolean inWord = false;
        for(char c : s.toCharArray()){
            if(c==' ') 
            {  
                if(inWord){st.add(sb);
                sb=new StringBuilder();}
                inWord=false;
            }
            else
           { sb.append(c);
            inWord = true;}
        }if(inWord) {
            // if we were inside a word at the end of the string, add the current word to the stack
            st.add(sb);
        }
        
        s="";
        while(!st.isEmpty()){
            s+=st.pop();
            s+=" ";
        }
        return s.trim();
    }
}