class Solution {
    public int climbStairs(int n) {
        int a=1; int b =1;
        for(int i =n-1 ;  i>=1; i--){
            int temp = a;
            a = a+b;
            b = temp;
        }
        return a;
    }
}