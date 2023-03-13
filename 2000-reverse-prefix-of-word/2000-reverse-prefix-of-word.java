class Solution {
    public String reversePrefix(String word, char ch) {
    StringBuilder sb1 = new StringBuilder();
    boolean flag = false;
    int i = 0;
    for (char c : word.toCharArray()) {
        if (c == ch) {
            sb1.append(ch);
            flag = true;
            break;
        }
        else{
        sb1.append(c);
        i++;}
    }
        if(flag){
            sb1.reverse();
            for(int k =i+1;k<word.length();k++){
                sb1.append(word.charAt(k));
            }
        }
    System.out.println(sb1);
    System.out.println(i);
    return (flag == true) ? sb1.toString() : word;
    }
}