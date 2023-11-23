class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet();

        for(String email: emails){
           String[] parts = email.split("@");
            String name = parts[0];
            String domain = "@"+parts[1];
             name = name.replaceAll("\\.", "");
            int plusIndex = name.indexOf('+');
            if (plusIndex != -1) {
                name = name.substring(0, plusIndex);
            }
            set.add(name+domain);
        }
        return set.size();
    }
}