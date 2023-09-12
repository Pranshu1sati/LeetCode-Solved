class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
         int size = flowerbed.length;
        if(n==0) return true;
        if(size==1 ){
            if(flowerbed[0]==0 && n ==1) return true;
            else return false;
        } 
        int i =0;
        while(i<size && n>0) {
            // System.out.println(i + "before check");
            if(i==0)
            {if(flowerbed[i]==0 && flowerbed[i+1] == 0 ) {
                n--;
                flowerbed[i] = 1;
            }}
            if(i==flowerbed.length-1)
            {if(flowerbed[i]==0 && flowerbed[i-1] == 0 ) {
                n--;
                flowerbed[i] = 1;
            }}
            if(i>0 && flowerbed[i]==0 && flowerbed[i-1] !=1 && flowerbed[i+1] !=1  ){
                // System.out.println(i +  "after check");
                n--;
                
                flowerbed[i] =1;
            } 
            i++;
        }
        // System.out.println(n);
        return n==0;
    }
}