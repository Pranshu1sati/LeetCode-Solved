class Solution {
    public static List<Long> split4real(long finalSum,ArrayList<Long> res ){
        long currNum = 2;
        long remainingSum = finalSum;
        
        while(currNum <= remainingSum) {
            res.add(currNum);
            remainingSum -= currNum;
            currNum += 2;
        }
        long last = res.remove(res.size()-1);
        res.add(last+remainingSum);
        return res;
    }
    public List<Long> maximumEvenSplit(long finalSum) {
        ArrayList <Long> l = new ArrayList<>();
        if(finalSum%2!=0) return l;
        return split4real(finalSum,l);
    }
}