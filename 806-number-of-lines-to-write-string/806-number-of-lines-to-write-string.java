class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        char chrs[]=s.toCharArray();
        int len=chrs.length;
        
        int line=1, size=0;
        for(int i=0; i<len; i++)
        {
            char tempCh=chrs[i];
            //agar mera current size k saath aur ek char add karne se size 100pixel k equal or 100 se chota raha..
            if((size+widths[tempCh%97])<=100)
            {
                //toh karo add...
                size+=widths[tempCh%97];
            }
            else
            {
                //nahi toh line no. badao aur agli line pe jao jiska size us naya wala charracter ke size se shuru hoga....
                line++;
                size=widths[tempCh%97];
            }
        }
        
        int res[]={line, size};
        return res;   
    }
}