class Solution {
    public String digitSum(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int temp = 0;
        while(s.length() > k) {
            sb.setLength(0);
            for(int i = 0; i < s.length(); i += k) {
                temp = 0;
                for(int j = i; j < i + k && j < s.length(); j++) {
                    temp += s.charAt(j) - '0';
                }
                sb.append(temp);
            }
            s = sb.toString();
        }
        return s;
    }
}