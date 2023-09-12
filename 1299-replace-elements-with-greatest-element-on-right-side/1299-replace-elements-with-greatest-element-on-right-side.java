class Solution {
    public int[] replaceElements(int[] arr) {
        if(arr.length==1) return new int[]{-1};
        int gR[]  = new int [arr.length];
        int maxR = Integer.MIN_VALUE;
        for( int i =arr.length-1 ; i>=0; i--){
            if(maxR<arr[i]) maxR = arr[i];
            gR[i] = Math.max(arr[i], maxR);
        }
        int[] ans = new int [arr.length];
        for(int i =1 ; i <arr.length; i++){
            
            ans[i-1] = gR[i];
        }
        ans[arr.length-1] = -1;
        return ans;
    }
}