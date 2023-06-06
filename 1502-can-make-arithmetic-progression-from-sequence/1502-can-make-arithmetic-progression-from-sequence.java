class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int pdiff = Math.abs(arr[0] - arr[1]);
        for(int i =0; i<arr.length-1;i++){
            if(pdiff!=Math.abs(arr[i]-arr[i+1]))return false;
        }
        return true;
    }
}