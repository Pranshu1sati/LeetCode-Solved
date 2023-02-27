class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set =new HashSet();
        int count=0;
        for(char c : jewels.toCharArray()){
            set.add(c);
        }
        for(char s:stones.toCharArray())
        {
        if(set.contains(s)) count++;
        }
        return count;
    }
}