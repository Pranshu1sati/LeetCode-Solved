class Solution {
public:
    int secondsToRemoveOccurrences(string s) {
        int flag = 0;
        int time = 0;
        
        for(int i=0;i<s.length()-1;i++)
        {
           for(int j = 0 ; j<s.length() ; j++)
           {
               if(s[j] == '0' && s[j+1] == '1')
               {
                   swap(s[j],s[j+1]);
                   ++j;
                   // time++;/
                   flag = 1;
               }
           } 
            if(flag == 1){
                time++;
            }
            flag = 0;
        }
        
        return time;
    }
};