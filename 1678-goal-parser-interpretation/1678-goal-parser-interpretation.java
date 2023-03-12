class Solution {
    public String interpret(String s) {
        int i =0;
        StringBuilder sb = new StringBuilder();
        while(i<s.length()){
            if(s.charAt(i)=='G'){
                sb.append("G");
                
            }
            else if(s.charAt(i)=='(')
            {
                if(s.charAt(i+1)==')')
                {
                    sb.append("o");
                    i++;
                }
                else
                   { sb.append("al");
                    i=i+3;}
            }
            i++;
        }
        return sb.toString();
    }
}