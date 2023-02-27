class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set =new HashSet();
       int ans = 0;
        for(char i : jewels.toCharArray()) {
            ans += stones.chars().filter(ch -> ch == i).count();
        }
        return ans;
    }
}