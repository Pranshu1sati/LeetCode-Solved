class Solution {
        public int uniqueLetterString(String s) {
        int n = s.length();
        int[] lastIndex = new int[26];
        Arrays.fill(lastIndex, -1);
        int[] f = new int[n];
        for (int i = 0; i < n; i++) {
            int c = (s.charAt(i) - 'A') ;
            f[i] = i - lastIndex[c];
            lastIndex[c] = i;
        }
        Arrays.fill(lastIndex, n);
        int res = 0;
        for (int i = n - 1; i >= 0; i--) {
            int c = (s.charAt(i) - 'A') ;
            f[i] = (lastIndex[c] - i) * f[i];
            res += f[i];
            lastIndex[c] = i;
        }
        return res;
    }
}