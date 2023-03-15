class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
     int num1 = getNumericalValue(firstWord);
        int num2 = getNumericalValue(secondWord);
        int targetNum = getNumericalValue(targetWord);
        return (num1 + num2) == targetNum;
    }
    
    private int getNumericalValue(String word) {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            sb.append((int)(c - 'a'));
        }
        return Integer.parseInt(sb.toString());
    }
}