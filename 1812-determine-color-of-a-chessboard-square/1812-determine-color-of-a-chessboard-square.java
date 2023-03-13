class Solution {
    public boolean squareIsWhite(String s) {
         if((s.charAt(0)=='a'||s.charAt(0)=='c'||s.charAt(0)=='e'||s.charAt(0)=='g')&&(Character.getNumericValue(s.charAt(1))%2==0)) return true;
        if((s.charAt(0)=='b'||s.charAt(0)=='d'||s.charAt(0)=='f'||s.charAt(0)=='h')&&(Character.getNumericValue(s.charAt(1))%2!=0)) return true;
        else return false;
    }
}