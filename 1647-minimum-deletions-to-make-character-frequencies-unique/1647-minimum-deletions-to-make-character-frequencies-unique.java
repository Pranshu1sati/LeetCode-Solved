class Solution {
    public int minDeletions(String s) {
        int []cCount = new int[256];
        for(char c : s.toCharArray()){
            cCount[c-'a']++; 
        }
         int deletions = 0;
        Set<Integer> usedFrequencies = new HashSet<>();
        
        // Iterate through the frequency counts.
        for (int i : cCount) {
            while (usedFrequencies.contains(i) && i > 0) {
                // If the frequency is already used, decrement it until it's unique.
                i--;
                deletions++;
            }
            
            usedFrequencies.add(i); // Mark this frequency as used.
        }
        
        return deletions;
    }
}