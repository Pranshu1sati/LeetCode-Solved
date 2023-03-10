class Solution {
        public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> indexMap = new HashMap<>();
        List<String> commonStrings = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) {
            indexMap.put(list1[i], i);
        }
        for (int j = 0; j < list2.length; j++) {
            String s = list2[j];
            if (indexMap.containsKey(s)) {
                int currentSum = j + indexMap.get(s);
                if (currentSum < minSum) {
                    minSum = currentSum;
                    commonStrings.clear();
                    commonStrings.add(s);
                } else if (currentSum == minSum) {
                    commonStrings.add(s);
                }
            }
        }
        return commonStrings.toArray(new String[commonStrings.size()]);
    }
}