class Solution {
    public int[] shuffle(int[] nums, int n) {

             int l =0 ;
             int r =nums.length/2;
        int [] numss = new int [nums.length];
        int i = 0;
        while(r<nums.length){
            numss[i] = nums[l];
            numss[i+1] = nums[r];
            i+=2;r++;l++;
        }
        return numss;
        }
    }
