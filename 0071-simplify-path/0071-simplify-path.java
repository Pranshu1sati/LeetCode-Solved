class Solution {
    public String simplifyPath(String path) {
        if(path.charAt(0) != '/'){
            return "";
        }
        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");

        for(String e : parts){
            if(!stack.isEmpty() && e.equals("..")){
                stack.pop();
            }
            else if(!e.equals("..") && !e.equals("") && !e.equals(".")){
                stack.push(e);
            }
        }

        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()){
            result.insert(0 , stack.pop()).insert(0 ,"/");
        }
        return result.length() == 0 ? "/" : result.toString();
    }
    
}