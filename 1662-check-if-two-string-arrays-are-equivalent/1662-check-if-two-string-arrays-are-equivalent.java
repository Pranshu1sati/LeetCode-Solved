class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String one = word1[0];
        for(int i =1; i<word1.length;i++){
            one+=word1[i];
        }
        String two=word2[0];
        for(int i=1;i<word2.length;i++)
        {
            two+=word2[i];
        }
        return one.equals(two);
    }
}