class Solution {
    public int compress(char[] chars) {
         if(chars.length == 1) return 1;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int n = chars.length;
        int ct = 0;
        while(i < n)
        {
            ct = 0;
            char ch = chars[i];
            sb.append(ch);
            while(i < n && chars[i] == ch)
            {
                ct++;
                i++;
            }
            if(ct!=1)
            {
               sb.append(ct);
            }
            
        }
        for( i = 0 ; i < sb.length() ; i++)
        {
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }
    }
