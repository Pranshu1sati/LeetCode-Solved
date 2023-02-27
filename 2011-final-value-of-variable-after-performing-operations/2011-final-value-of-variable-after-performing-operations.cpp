class Solution {
public:
    int finalValueAfterOperations(vector<string>& operations) {
        int c=0;
        for(auto x: operations){
            istringstream ss(x);
            string w;
            while(ss>>w){
            if(w[1]=='+'){
                c++;
            }
                else
                    c--;
            }
        }
        return c;
    }
};