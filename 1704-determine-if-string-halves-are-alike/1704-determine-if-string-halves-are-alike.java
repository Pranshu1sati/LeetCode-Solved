class Solution {
    public boolean halvesAreAlike(String s) {
        //1st half
        //2nd half
        //if second half = 1st half
         int h1 = 0;
        int h2 = s.length() / 2;
        int vca = 0;
        int vcb = 0;
        for(int i = 0 ; i < s.length() ; i++) {         
            if(h2 >= s.length()) {
                break;
            }
           
            if(s.charAt(h1)=='a'||s.charAt(h1)=='e'||s.charAt(h1)=='i'||s.charAt(h1)=='o'||s.charAt(h1)=='u') {
                vca++;
            }
            if(s.charAt(h2)=='a'||s.charAt(h2)=='e'||s.charAt(h2)=='i'||s.charAt(h2)=='o'||s.charAt(h2)=='u') {
                vcb++;
            }   if(s.charAt(h1)=='A'||s.charAt(h1)=='E'||s.charAt(h1)=='I'||s.charAt(h1)=='O'||s.charAt(h1)=='U') {
                vca++;
            }
            if(s.charAt(h2)=='A'||s.charAt(h2)=='E'||s.charAt(h2)=='I'||s.charAt(h2)=='O'||s.charAt(h2)=='U')             {
                vcb++; 
            }   
            h1++;
            h2++;
        } 
        return vca == vcb;
    }
    }
