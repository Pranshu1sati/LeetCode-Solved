class Solution {
        public int uniqueLetterString(String s) {
        int n = s.length();
        List<List<Integer>> hashmap = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            hashmap.add(new ArrayList<>());
            hashmap.get(i).add(-1);
        }
        
        //Store all indices
        for (int i = 0; i < n; i++) {
            hashmap.get(s.charAt(i) - 'A').add(i);
        }
        
        //Push length of string for all keys at the end of each value list
        for (int i = 0; i < 26; i++) {
            hashmap.get(i).add(n);
        }
        
        long count = 0;
        for (int i = 0; i < 26; i++) {
            for (int j = 1; j < hashmap.get(i).size() - 1; j++) {
                count += (hashmap.get(i).get(j) - hashmap.get(i).get(j - 1)) 
                    * (hashmap.get(i).get(j + 1) - hashmap.get(i).get(j));
            }
        }
        return (int) (count % 1000000007);
    }
}