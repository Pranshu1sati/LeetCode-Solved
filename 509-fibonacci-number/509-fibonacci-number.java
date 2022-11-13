class Solution {
    public int fib(int n) {
         int m =1;
        double Phi= ( m + Math.sqrt(5))/ 2;
        double phi = ( m - Math.sqrt(5))/ 2;
        double ans = (Math.pow(Phi, n)-Math.pow(phi, n))/Math.sqrt(5);
        return ((int)ans);
    }
}