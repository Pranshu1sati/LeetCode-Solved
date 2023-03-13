class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count =0;
        for(String patern:patterns){
            if(word.contains(patern))count++;
        }
        return count;
    }
}