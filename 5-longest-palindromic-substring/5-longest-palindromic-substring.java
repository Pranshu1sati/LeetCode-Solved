class Solution {
     public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];

        int totalPalindromeCount = 0; // Just to calculate total numbers of palindrome in the string.
        int smallIndex = 0; // To save the smaller index where we find the largest palindrome.
        int largeIndex = 0; // To save the larger index where we find the largest palindrome.
        int maxPalindromeLength = 0; // To get the largest length of the palindrome
        for (int gap = 0; gap < n; gap++) { // gap represent a diagonal. gap =0 represent the first diagonal from (0,0)
                                            // to (n,n). gap =1 represent second diagonal from (0,1) to (n-1,n). Hence
                                            // it goes on.
            for (int i = 0, j = gap; i < n && j < n; i++, j++) {
                if (i == j) { // every single alphabet is a palindrome in itself.
                    dp[i][j] = true;
                    continue;
                }
                if (j < i) { // Just for remembering, otherwise not required since initial array will be
                             // filled with false;
                    dp[i][j] = false;
                    continue;
                }

                char ch1 = s.charAt(i);
                char ch2 = s.charAt(j);

                if (ch1 != ch2) { // It the character are not equal, cannot be a palindrome.
                    dp[i][j] = false;
                } else {
                    if (gap == 1) { // edge case, for 2 length string, if both the character are equal then also it
                                    // is a palindrome. For Example, dry run on string "gegpeepf", here ee can also
                                    // ` be a palindrome with length 2.
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                        // If both the characters are equal, then I will have to ask from
                        // the elements between both the character to tell if they are
                        // palindrome. For ex : "peep", the p at 0th and 3rd index are
                        // equal. But the whole string "peep" is palindrome depends upon
                        // wherther "ee" the string between is palindrome or not. If it is
                        // palindrome, the string "peep" is palindrome. But the string
                        // "pekp" will not be a palindrome for the same reason.
                    }
                }

                if (dp[i][j]) {
                    totalPalindromeCount++;
                    if (j - i + 1 > maxPalindromeLength) { // j-i+1 will be the length of the palindrome.
                        maxPalindromeLength = j - i + 1;
                        smallIndex = i;
                        largeIndex = j;
                    }
                }
            }
        }
        
        return s.substring(smallIndex, largeIndex + 1);
    }
}