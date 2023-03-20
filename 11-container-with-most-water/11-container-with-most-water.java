class Solution {
    public int maxArea(int[] height) {
        int l =0,r =height.length-1;
        int water =0;
        while(l<r){
            water = Math.max(water,Math.min(height[r],height[l])*(r-l));
            if(height[l]>height[r])r--;
            else l++;
        }
        return water;
    }
}