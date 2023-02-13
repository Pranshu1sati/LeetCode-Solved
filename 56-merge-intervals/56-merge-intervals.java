class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1)
            return intervals;
        Arrays.sort(intervals,(o1,o2)-> Integer.compare(o1[0],o2[0]));
        List<int[]> output_arr= new ArrayList();
        int[]current_interval = intervals[0];
        output_arr.add(current_interval);
        for(int[] invterval : intervals){
            int current_begin=current_interval[0];
            int current_end=current_interval[1];
            int next_begin = invterval[0];
            int next_end = invterval[1];
            if(current_end >= next_begin){
                current_interval[1]=Math.max(current_end, next_end);
            }
            else{
                current_interval = invterval;
                output_arr.add(current_interval);
            }
        }
        return output_arr.toArray(new int[output_arr.size()][]);
    }
}