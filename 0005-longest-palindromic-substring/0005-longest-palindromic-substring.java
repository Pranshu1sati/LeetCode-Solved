class Solution {
    public String longestPalindrome(String s) {
        // StringBuilder sb = new StringBuilder();
        // int i =0,j=s.length();
        // while(i<j){
        //     if(s.charAt(i)==s.charAt(j)) sb.append(s.charAt(i));
        //     else sb.clear();
        // }
        // return sb.toString();
        // int dp[][] = new int[s.length()+1][s.length()+1];
            // String rts = s.reverse();
    int strLength = s.length();

        if (strLength < 2) {
            return s;
        }

        int resultLength = 0;
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            //Odd length
            int left = i, right = i;
            while (
                left >= 0 &&
                right < s.length() &&
                s.charAt(left) == s.charAt(right)
            ) {
                if ((right - left + 1) > resultLength) {
                    result = s.substring(left, right + 1);
                    resultLength = right - left + 1;
                }
                left -= 1;
                right += 1;
            }

            // even length
            left = i;
            right = i + 1;
            while (
                left >= 0 &&
                right < s.length() &&
                s.charAt(left) == s.charAt(right)
            ) {
                if ((right - left + 1) > resultLength) {
                    result = s.substring(left, right + 1);
                    resultLength = right - left + 1;
                }
                left -= 1;
                right += 1;
            }
        }

        return result;
    }
}