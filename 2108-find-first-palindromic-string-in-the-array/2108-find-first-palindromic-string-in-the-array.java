class Solution {
    public String firstPalindrome(String[] words) {
        String ans ="";
        for(String w : words)
        {   if(w.length()<=1) return w;
            int r = 0, l = w.length() - 1;
            boolean flag = false;
            while(r<l)
            {
                if(w.charAt(l)==w.charAt(r))
                {  r++;
                    l--;
                 flag =true;
                }
                
                else {
                    flag=false;
                break;
                }
            }
            if (r >= l && flag == true) 
            {
            return ans=w;
            }
    }
    return ans;
    }    
}