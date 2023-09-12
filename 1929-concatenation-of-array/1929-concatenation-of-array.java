class Solution {
    public int[] getConcatenation(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        for( int n : nums) al.add(n);
        for(int n : nums) al .add(n);
        int[] arr = al.stream().mapToInt(i -> i).toArray();
        return arr;
    } 
}