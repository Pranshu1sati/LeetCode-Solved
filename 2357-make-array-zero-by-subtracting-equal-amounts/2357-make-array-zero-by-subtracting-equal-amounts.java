class Solution {
    public int minimumOperations(int[] nums) {
        boolean[] arr=new boolean[101];
         int count=0;

         for(Integer num:nums){
             arr[num]=true;
         }

         for(int i=0;i<arr.length;i++){
             if(arr[i]) count++;
         }

         return (arr[0])?count-1:count;
    }
}