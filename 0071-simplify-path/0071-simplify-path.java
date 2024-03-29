class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        StringBuilder s = new StringBuilder();
        String[] p = path.split("/");
        for(int i =0;i<p.length; i++){
            if(!st.isEmpty() && p[i].equals("..")) st.pop();
            else if (!p[i].equals("") && !p[i].equals(".") && !p[i].equals("..")) st.push(p[i]);
        }
        if(st.isEmpty())return "/";
        while(!st.isEmpty()){
            s.insert(0,st.pop()).insert(0,"/");
        }
        return s.toString();
    }
}