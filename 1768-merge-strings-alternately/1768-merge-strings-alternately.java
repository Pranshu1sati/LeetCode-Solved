class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i =0 ,j=0;
        StringBuilder sb = new StringBuilder();
 for (int k = 0; k < word1.length() + word2.length(); k++) {
        if (i < word1.length()) {
            sb.append(word1.charAt(i));
            i++;
        }
        if (j < word2.length()) {
            sb.append(word2.charAt(j));
            j++;
        }
    }
    return sb.toString();}
}