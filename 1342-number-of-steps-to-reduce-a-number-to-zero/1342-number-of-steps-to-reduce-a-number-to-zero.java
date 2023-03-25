class Solution {
    public int helper(int num,int steps){
        while (true){
        if(num==0) break;
        num = (num%2==0) ?  num/2 :  num-1;
        steps++;
        }
        return steps;
    }
    public int numberOfSteps(int num) {
        return helper(num,0);
    }
}