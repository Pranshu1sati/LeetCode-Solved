class Solution {
    public String generateTheString(int n) {
         String result="";
        if(n%2==0)
        {
            for(int i=0;i<n-1;i++)
            {
                result=result+"a";
            }
            result=result+"b";
        }
        else
        {
            for(int j=0;j<n;j++)
            {
                result=result+"c";
            }
        }
        return result;
    }
}