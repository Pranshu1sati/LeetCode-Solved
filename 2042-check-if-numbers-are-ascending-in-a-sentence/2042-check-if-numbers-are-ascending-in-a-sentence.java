class Solution {
   
        public boolean areNumbersAscending(String s) {
        int previous = 0;
    
    for(String str: s.split(" "))
    {
        if(Character.isDigit(str.charAt(0)))
        {
            int number = Integer.parseInt(str);
            
            if(number <=previous)
                return false;
            
            previous = number;
        }
    }
    return true;
    }
}