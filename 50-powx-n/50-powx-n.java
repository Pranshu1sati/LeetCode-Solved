class Solution {
    public double myPow(double x, int n) {
       if(n==0) return 1;
        if(x==1 || n==1)
            {return x;}
        if(n<0){
             return (1/x) * myPow(1/x , -(n+1));
        }
        double halfpow = myPow(x*x,n/2) ;
        if(n%2!=0) {return x*halfpow;}
        else
        return halfpow; 
    }
}