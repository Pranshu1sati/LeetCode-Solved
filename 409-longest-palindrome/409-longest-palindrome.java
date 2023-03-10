class Solution {
     public int longestPalindrome(String s) {
        char[] str = s.toCharArray();
        int len = str.length,count=0;
        if(len == 1)
        return 1;
        int[] arr = new int[58];
        for(int i = 0;i < len;i++){
            arr[str[i] - 'A']++;
        }
        for(int i = 0;i<58;i++){
            if(arr[i]%2 == 0)
            count += arr[i];
            else if(arr[i]>1)
            count += arr[i]-1;
        }
        if(len == count)
        return count;
        count++;
        return count;
    }
}