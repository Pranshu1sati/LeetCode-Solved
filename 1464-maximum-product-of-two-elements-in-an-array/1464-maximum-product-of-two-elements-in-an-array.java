class Solution {
    public int maxProduct(int[] nums) {
      int a =Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        for(int n : nums){
            if(n>a){
                b=a;
                a=n;
            }
            else if(n>b){
                b = n;
            }
        }
        return(a-1)*(b-1);
    }
}