class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> Map = new HashMap<>();
        for(String word : words){
            Map.put(word, Map.getOrDefault(word, 0)+1);
        }
PriorityQueue<String> pq = new PriorityQueue<>(
    new Comparator<String>() {
            @Override
             public int compare(String wordl, String word2) {
                int frequencyl = Map.get(wordl);
                int frequency2 = Map.get(word2);
                if (frequencyl==frequency2) return word2.compareTo(wordl);
                 return frequencyl-frequency2;
             }
    });
      for (Map.Entry<String, Integer> entry: Map.entrySet())
          {
             pq.add (entry. getKey() ) ;
                if (pq.size() > k) pq.remove();
            }
        List<String> result= new ArrayList<>();
        while (!pq.isEmpty()) result.add(pq.remove());
        Collections. reverse (result) ;
        return result;
    }
}