class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length - 2; i++) {
           //  0    1 2  3    4    5   6 7   8     9 
//          "alice is a good girl she is a good student"
            if (words[i].equals(first) && words[i+1].equals(second)) {
                list.add(words[i+2]);
            }
        }
        return list.toArray(new String[list.size()]);
    }
}