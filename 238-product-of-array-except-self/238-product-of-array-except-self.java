class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] ans =new int[nums.length];
        int product=1;
		//lest dry run for I/P nums[]={1,2,3,4} O/P will be{24,12,8,6}
            for(int i = 0 ;i<nums.length;i++){
                product*=nums[i];
                ans[i]=product;
            }//ans[n]={1,2,6,12}
        product=1;
        for(int i =nums.length-1;i>0; i--){
            ans[i]=ans[i-1]*product;
			product*=nums[i];
			//1st pass 
				//ans[3]=ans[2]ie product of all elements to the left of nums[3] accept nums[3]*1//as nums[3] id the left most element after this product will be updated to 4 or rather 4*1
			//2nd pass
				//ans[2]=ans[1]*product ie product of all elements from nums before or to the left of i and the element after i or to the right of i product variable will be updated to 4*3
			//3rd pass
				//ans[1]=ans[0]*product  ie  product of all nums element to the right of nums[1]*product of all elements to the left of nums[1]	product variable will be updated to 12*2		
            
        }
        ans[0]=product;//the pruduct of all element except the first elemnt or rather the product of all the elements to its right
        return ans;
    }
}