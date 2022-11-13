
class Solution {
    public boolean isPal( String word ){
       
        if( word.length()==0 || word.length()==1 ){
            return true;
        }
        else if(word.charAt(0) == word.charAt(word.length()-1))
        {
            return isPal(word.substring(1,word.length()-1));
        }
        return false;
    }

    
    public String firstPalindrome(String[] words) {
        String result = "";
        for(int i =0; i< words.length; i++){
            if(isPal(words[i]) ){
                result = words[i];
                return result;
            }
        }
        return result;
    }
}
