class Solution {
    public int maxProfit(int[] prices) {
        //Stack<Integer> st = new Stack<>();
        int min=Integer.MAX_VALUE;
        int max = 0;
        for(int n : prices){
            if(n<min) min = n;
            max= Math.max(max,n-min);
        }
        return max;
    }
}