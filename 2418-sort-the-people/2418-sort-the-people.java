class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String>t=new TreeMap<>();
        ArrayList<String> l = new ArrayList<>();
        for(int i=0;i<names.length;i++)
        {
            t.put(heights[i],names[i]);
        }
        for(String x:t.values())
        {
            l.add(x);
        }
        Collections.reverse(l);
        System.out.println(l);
        String arr[]=new String[l.size()];
        for(int i=0;i<l.size();i++)
        {
           arr[i]=l.get(i);
        }
        return arr;
    }
}