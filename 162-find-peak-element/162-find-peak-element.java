class Solution {
    public int findPeakElement(int[] nums) {
        int size = nums.length;

        //our start and end pointers
       int start = 0;
       int end = size-1;

        //edge case 
       if(size == 1)return 0;

        //binary search started
       while(start <= end){
           int mid = start + (end - start)/2;

           //we ignore starting and ending index
           // because they have only one beighbor
           if(mid > 0 && mid < size-1){

               //here we are checking if our mid is greater
               // than previous and later element
               // if that so we just simply return mid
               if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
                   return mid;
               }

                //and if its not than we'll which side have higher
                //chance of having peak element 
                else{
                   if(nums[mid-1] > nums[mid]){
                       end = mid - 1;
                   }
                   else{
                       start = mid + 1;
                   }
               }
           }


            //these are edge cases for starting and ending element
           if(mid == 0){
               if(nums[mid] > nums[mid+1]){
                   return mid;
               }
               else{
                   return mid+1;
               }
           }

           
           if(mid == size-1){
               if(nums[mid] > nums[mid-1]){
                   return mid;
               }
               else{
                   return mid-1;
               }
           }


       }

       return -1;


    }
}