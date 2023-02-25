class Solution {
    public String frequencySort(String s) {
        
        Queue<int[]> q_ = new PriorityQueue<>((a,b) -> a[1] == b[1] ? b[0] - a[0]: b[1]-a[1]);

        Map<Integer,Integer> m_ = new HashMap<>();

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) 
            m_.put((int)chars[i], m_.getOrDefault((int)chars[i], 0) + 1);
        

        for (int key : m_.keySet()) 
            q_.add(new int[] {key, m_.get(key)});
        
        int index = 0;
        while (q_.size() > 0) 
        {
            int[] val = q_.poll();
            int num = val[0];
            int freq = val[1];

            while (freq > 0) 
            {
                chars[index++] = (char)num;
                freq--;
            }
        }

        return String.valueOf(chars);
    }
}