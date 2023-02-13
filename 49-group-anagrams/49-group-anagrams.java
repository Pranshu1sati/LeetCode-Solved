class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String, List<String>> Map = new HashMap<>();
         if (strs == null || strs.length == 0)
            return new ArrayList<>();
        for(String s: strs){
char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr);
            if (!Map.containsKey(key))
                 Map.put(key, new ArrayList<>());
            Map.get(key).add(s);
        }
         List<List<String>> resultList = new ArrayList<>();
    for (Map.Entry<String, List<String>> stringAnagrams : Map.entrySet()) {
      resultList.add(stringAnagrams.getValue());
    }
    return resultList;
    }
}