class Solution {
    public String[] findWords(String[] words) {
        
        Map<Character,Integer>rows = new HashMap<>();
         // Map<Character,Integer>row2 = new HashMap<>();
         // Map<Character,Integer>row3 = new HashMap<>();
    String firstRow = "qwertyuiop";
    String secondRow = "asdfghjkl";
    String thirdRow = "zxcvbnm";
        int i =1;
        for(char letter: firstRow.toCharArray()){
        rows.put(letter,1);
    }
    for(char letter: secondRow.toCharArray()){
        rows.put(letter,2);
    }
    for(char letter: thirdRow.toCharArray()){
        rows.put(letter,3);
    }
    ArrayList<String> result = new ArrayList<>();
        int r1=1,r2=2,r3=3;
        
        for(String s: words){
            result.add(s);
            int curr =0, prev =0;
            for(i=0 ; i< s.length();i++){
                 prev = curr;
                curr=rows.get(Character.toLowerCase(s.charAt(i)));
               if(prev!=0&&prev!=curr){
                   result.remove(s); break;
               }
            }
        }
    
//     for(String word: words){
//         int curr =0, prev =0;
//         result.add(word);
//         for(char letter: word.toCharArray() ){
            
//             prev = curr;
//             curr = rows.get(Character.toLowerCase(letter));
//              //Check if the input belongs to only one row
//             if(prev!=0 && curr!=prev){
//                 result.remove(word);
//                 break;
//             }
            
//         }
// }

return result.stream().toArray(String[]::new);
    }
}