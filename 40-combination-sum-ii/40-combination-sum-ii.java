class Solution {
    List < List < Integer >> ans = new ArrayList <> ();
    public List<List<Integer>> combinationSum2(int[] c, int t) {
        Arrays.sort(c);
        List<Integer> al = new ArrayList<Integer>();
        sum4real(c, al, t, c.length, 0 );
        return ans;
    }
    private void sum4real(int[] c, List<Integer> al, int  t, int n , int i ){
        if(i==n){
            if(t==0) ans.add(new ArrayList<>(al));
            return;
        }

        if(i==n) return ;
        //pick
        if(c[i]<=t)
        {al.add(c[i]);
         sum4real(c, al, t-c[i] , n, i+1 );
        al.remove(al.size()-1);}
        while(i + 1 < c.length && c[i] == c[i + 1]) i++ ;
         sum4real(c,al ,t,n,i+1) ;
    }
}