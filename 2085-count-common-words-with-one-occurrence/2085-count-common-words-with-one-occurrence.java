class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words1) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (String word : words2) {
            if (map.containsKey(word) && map.get(word) < 2) {
                map.put(word, map.get(word) - 1);
            }
        }
        int count = 0;
        for (int freq : map.values()) {
            if (freq == 0) {
                count++;
            }
        }
        return count;
    }
}