class Solution {
    public String removeStars(String s) {
       StringBuilder str= new StringBuilder();
        for(int i =0;i<s.length();i++){
            str.append(s.charAt(i));
            if(s.charAt(i) == '*')
            {
                str.deleteCharAt(str.length()-1);
                str.deleteCharAt(str.length()-1);
            }
        }
        return str.toString();
    }
}