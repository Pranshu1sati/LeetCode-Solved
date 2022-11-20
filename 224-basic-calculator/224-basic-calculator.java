class Solution {
    public int calculate(String s) {
       Stack<Integer> stack = new Stack<>();
       int sign = 1, currNo = 0, ans = 0;
       for(int i = 0; i < s.length(); i++){
           if(Character.isDigit(s.charAt(i))){
               // String '0' into int 0;
               currNo = s.charAt(i) - '0';
               while( i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))){
                   // if number if > 10; eg: 12 ( 1 * 10 + 2);
                   currNo = currNo * 10 + s.charAt(i + 1) - '0';
                   i++;
               }
               currNo = currNo * sign;
               ans += currNo;
               currNo = 0;
               sign = 1;
           }else if(s.charAt(i) == '+'){
               sign = 1;
           }else if(s.charAt(i) == '-'){
               sign = -1;
           }else if(s.charAt(i) == '('){
               stack.push(ans);
               stack.push(sign);

               // reset the ans and sign beacause we have to calculate value inside parentheses
               ans = 0;
               sign = 1;
           }else if(s.charAt(i) == ')'){
               int prevSign = stack.pop();
               ans = prevSign * ans;
               int prevAns = stack.pop();
               ans = ans + prevAns;
           }
       } 

       return ans;
    }
}