class Solution {
    public boolean isValid(String Str) {
       
 Stack<Character> s= new Stack<>();
        for(int i =0 ; i<Str.length();i++){
            if( Str.charAt(i)  =='{' ||Str.charAt(i)  =='(' || Str.charAt(i)  =='[') s.push(Str.charAt(i));
            else
            {
                if(s.isEmpty()) return false;
                if((s.peek()=='{'&& Str.charAt(i) == '}')||(s.peek()=='('&& Str.charAt(i) == ')')||(s.peek()=='['&& Str.charAt(i) == ']')){
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        return s.isEmpty();
        
    }
}