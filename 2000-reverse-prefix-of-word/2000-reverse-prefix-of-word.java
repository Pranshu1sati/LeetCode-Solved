class Solution {
    public String reversePrefix(String word, char ch) {
        if (!word.contains(String.valueOf(ch))) return word;
    StringBuilder sb1 = new StringBuilder();
    boolean flag = false;
    int  i = 0;
    for (char c : word.toCharArray()) {
        if (c == ch) {
            sb1.append(ch);
            i++;
            sb1.reverse();
            flag = true;
            break;
        }
        else{
        sb1.append(c);
        i++;}
    }
        if(flag){
            for(int k =i;k<word.length();k++){
                sb1.append(word.charAt(k));
            }
        }
       return (flag == true) ? sb1.toString() : word;
    }
}