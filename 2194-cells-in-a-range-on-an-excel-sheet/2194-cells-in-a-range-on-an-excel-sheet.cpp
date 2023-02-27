class Solution {
public:
    vector<string> cellsInRange(string s) {
        char a =s[0];
        int c=s[1]-'0',d=s[4]-'0';
        char b = s[3];
        vector<string> ans;
        while(a<=b){
            
            for(int i =c ;i<=d ;i++){
                string temp = "";
                temp+=a;temp+=i+'0';
                ans.push_back(temp);
                
            }
            a++;
        }
 return ans;
    }
    
};