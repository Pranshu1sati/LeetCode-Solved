class Solution {
    public int findTheLongestSubstring(String s) {
        Map<Integer,Integer>mp = new HashMap<>();
            int bit = 0;
                int ans = 0;
                mp.put(0,-1);
                for(int i=0;i<s.length();i++)
                {
        if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
                    bit = bit^(1<<(s.charAt(i)-'a'));
                    }
                    if(mp.containsKey(bit)) {
                            ans = Math.max(ans,i-mp.get(bit));
                            }
                else {
                mp.put(bit,i);
                    }
                }
            return ans;
    }
}