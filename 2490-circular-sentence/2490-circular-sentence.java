class Solution {
    public boolean isCircularSentence(String sentence) {
       
        int n = sentence.length();
        char a = sentence.charAt(0);

        for(int i = 0;i <n;i++){

            if(sentence.charAt(i) == ' '){
                if(sentence.charAt(i-1) != sentence.charAt(i+1)){
                    return false;
                }
            }
        } if(sentence.charAt(n-1) != a){
            return false;
        }
return true;
    }
}