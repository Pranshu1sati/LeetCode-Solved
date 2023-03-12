class Solution {
    public String truncateSentence(String s, int k) {
       StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                count++;
                if (count == k) {
                    break;
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }
}