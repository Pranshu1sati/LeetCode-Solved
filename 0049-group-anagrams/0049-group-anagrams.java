class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        if (strs == null || strs.length == 0)
            return new ArrayList<>();
        for (String s : strs) {
            char[] v = s.toCharArray();
            Arrays.sort(v);
            String key = String.valueOf(v); // Fix the variable name here
            if (!map.containsKey(key))
                map.put(key, new ArrayList<>());
            map.get(key).add(s);
        }
        List<List<String>> resultList = new ArrayList<>();
        for (Map.Entry<String, List<String>> stringAnagrams : map.entrySet()) {
            resultList.add(stringAnagrams.getValue());
        }
        return resultList;
    }
}