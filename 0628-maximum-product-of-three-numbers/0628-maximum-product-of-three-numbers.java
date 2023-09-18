class Solution {
    public int maximumProduct(int[] arr) {
        int max=Integer.MIN_VALUE,
        secondMax=Integer.MIN_VALUE, thirdMax=Integer.MIN_VALUE, min=Integer.MAX_VALUE, secondMin=Integer.MAX_VALUE;
      
         for(int i=0;i<arr.length;i++)
         {
             
           if(arr[i]>max)
           {
             thirdMax=secondMax;
             secondMax=max;
             max=arr[i];
           }
           else if(arr[i]<=max && arr[i]>secondMax)
           {
             thirdMax=secondMax;
             secondMax=arr[i];
           }
           else if(arr[i]<=secondMax && arr[i]>thirdMax)
             thirdMax=arr[i];
           
             
           if(arr[i]<min)
           {
             secondMin=min;
             min=arr[i];
           }
           else if(arr[i]>=min && arr[i]<secondMin)
             secondMin=arr[i];  
         }
        
        return Math.max((min*secondMin*max),(max*secondMax*thirdMax));  
    }
}