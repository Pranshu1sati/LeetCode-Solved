class Solution {
    public int mostWordsFound(String[] sentences)
    {
      int max=0;
        int l=sentences.length;
        for(int i=0;i<l;i++){
            int c=count(sentences[i]);
            if(c>max){
                max=c;
            }
        }
        return max;
    }
    int count(String s){
        int c=0;
        int l=s.length();
        for(int i=0;i<l;i++){
            char ch=s.charAt(i);
            if(ch==' '){
                c++;
            }
        }
        return c+1;
    }
}