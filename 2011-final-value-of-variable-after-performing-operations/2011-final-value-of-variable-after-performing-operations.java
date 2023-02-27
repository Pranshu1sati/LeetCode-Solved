class Solution {
    public int finalValueAfterOperations(String[] operations) {
         int value = 0;
        for(String operation : operations) 
        {
            if(operation.equals("X++") || operation.equals("++X")) 
            {
                value += 1;
            }
            else 
            {
                value -= 1;
            }
        }        
        return value;
    }
}