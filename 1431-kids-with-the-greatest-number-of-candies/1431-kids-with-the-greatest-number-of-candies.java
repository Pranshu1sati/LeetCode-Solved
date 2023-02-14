class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int m = Integer.MIN_VALUE;
        for(int c: candies){
            if(c>m){
                m=c;
            }
        }
        List<Boolean>  cd = new ArrayList<>();
        for(int i = 0; i< candies.length; i++){
            if(candies[i]+extraCandies>=m)
                cd.add(true);
            else 
                cd.add(false);
        }
        return cd;
    }
}