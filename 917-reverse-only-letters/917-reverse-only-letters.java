class Solution {
    public String reverseOnlyLetters(String s) {
                char [] letters = s.toCharArray();
        int i = 0, j = s.length() - 1;

        while(i < j){
            while(i < j && !Character.isLetter(letters[i])){
                i++;
            }
            
            while(i < j && !Character.isLetter(letters[j])){
                j--;
            }
            if(i < j){
                char temp = letters[i];
                letters[i] = letters[j];
                letters[j] = temp;
                i++;
                j--;
            }
        }
        return new String(letters);
    }
}