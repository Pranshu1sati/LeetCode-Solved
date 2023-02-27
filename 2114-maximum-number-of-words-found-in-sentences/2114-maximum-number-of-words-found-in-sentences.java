class Solution {
    public int mostWordsFound(String[] sentences)
    {
      int spaceCount = 0;
        int max = -1;

        for(int i=0; i<sentences.length; i++){
            spaceCount = sentences[i].split(" ").length - 1;
            if(max < spaceCount)
                max = spaceCount;
        }
        return ++max;
    }
}