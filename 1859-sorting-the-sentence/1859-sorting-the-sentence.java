class Solution {
    public String sortSentence(String s) {
        StringBuilder sb = new StringBuilder();
        String[] split = s.split(" ");
        Map<Integer, String> map = new HashMap<>();
         for (String s1 : split) {
            Integer index = Integer.valueOf(String.valueOf(s1.charAt(s1.length() - 1)));
            String str = s1.substring(0, s1.length() - 1);
            map.put(index, str);
        }
        for (int i = 0; i < split.length; i++) {
            String str = map.get(i + 1);
            sb.append(str);
            if (i != split.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}