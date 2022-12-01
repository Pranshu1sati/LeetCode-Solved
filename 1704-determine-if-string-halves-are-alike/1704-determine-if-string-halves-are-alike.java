class Solution {
    
     public boolean isVovel(char ch){
        if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'
            ||ch=='A'||ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                return true;
            }
            return false;
    }
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int i=0;
        int j=n-1;
        int countA=0, countB=0;
        while(i<j)
        {
            if(isVovel(s.charAt(i))) {countA++;}
            if(isVovel(s.charAt(j))) {countB++;}
               i++;
               j--;
        }
              return countA==countB;
    }
}