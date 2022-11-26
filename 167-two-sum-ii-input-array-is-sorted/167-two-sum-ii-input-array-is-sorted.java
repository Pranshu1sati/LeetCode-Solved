class Solution {
    public int[] twoSum(int[] arr, int target) {
       int i=0;
       int j=arr.length-1;
        while(i<j){
           int currSum=arr[i]+arr[j];
            if(currSum<target){
                i++;
            }
            else if(currSum>target){
                j--;
            }
            else if( currSum==target){
                return new int []{i+1,j+1};
            }
        }
        return new int[]{};
    }
}