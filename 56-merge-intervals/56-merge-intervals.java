class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1)
            return intervals;
  Arrays.sort(intervals,(o1,o2)-> Integer.compare(o1[0],o2[0]));
List<int[]> result = new ArrayList<>();
        int []current = intervals[0];
        result.add(current);
        for(int i = 1 ; i< intervals.length; i++)
        {
            int[] next = intervals[i];
            if(current[1]>=next[0]){
                current[1] = Math.max(current[1], next[1]);
            }
            else {
            current = next;
            result.add(current);
            }
            
        }
    int[][] resultArray = new int[result.size()][2];
    for (int i = 0; i < result.size(); i++) {
        resultArray[i] = result.get(i);
    }
      return resultArray;  
    }
}