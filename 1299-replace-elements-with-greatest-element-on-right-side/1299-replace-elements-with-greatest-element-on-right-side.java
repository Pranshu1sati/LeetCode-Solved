class Solution {
    public int[] replaceElements(int[] arr) {
        if(arr.length==1) return new int[]{-1};
        
         int maxRight = -1;
    
    for(int i = arr.length - 1; i >= 0; i--) {
      int curr = arr[i];
      arr[i] = maxRight;
      maxRight = Math.max(maxRight, curr);
    }
    
    return arr;
    }
}