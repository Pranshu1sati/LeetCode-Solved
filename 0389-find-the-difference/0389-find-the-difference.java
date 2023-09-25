class Solution {
    public char findTheDifference(String s, String t) {
        int[]chrar=new int[26];
        for(char c : t.toCharArray()) 
            chrar[c-'a']++;
        for(char c : s.toCharArray()) 
            chrar[c-'a']--;
        int i =0;
        for(;i<26;i++){
            if(chrar[i]!=0)
                break;
        }
        return (char)(i+'a');
    }
}