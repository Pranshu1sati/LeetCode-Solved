class Solution {
    public int singleNonDuplicate(int[] nums) {
        int x= nums[nums.length-1];
        int z=0;
        
        int []count= new int[x+1];
        for(int i = 0 ; i< nums.length ; i++){
         count[nums[i]]++;
                    }
        for(int i =0 ;i<count.length;i++){
            if(count[i]==1)
                z=i;
        }
        return z;
        }
}