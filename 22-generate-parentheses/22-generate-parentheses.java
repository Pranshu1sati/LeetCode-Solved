class Solution {
    public void addparenthesis( List<String> res,String Str , int i ,int j){
         if (i==0 && j==0) {
            res.add(Str);
            return;
        }

        if (j>0) addparenthesis(res, Str+")", i, j-1);
        if (i>0) addparenthesis(res, Str+"(", i-1, j+1);
    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        addparenthesis(res, "", n, 0);
        return res;
    }
}