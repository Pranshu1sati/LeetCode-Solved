class Solution {
    public void sortColors(int[] nums) {
        int[]n = new int[3];
        for(int i = 0 ; i< nums.length ; i++){
            n[nums[i]]++;
        }
        int i =0;
        int j =0;
        while(i<= 2)
        {
        if(n[i]>0)
        {
            nums[j] = i;
            n[i] = n[i] - 1;
            j++;
        }
        else{
            i++;
        }
        }
        // return nums;
    }
}