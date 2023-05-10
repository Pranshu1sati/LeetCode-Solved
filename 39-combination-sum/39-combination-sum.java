class Solution {
    List<List<Integer>> ans;
    public void rec(int[] c ,int i,int t,List<Integer> arr){
        if(t==0){
            if(!ans.contains(arr))
                ans.add(new ArrayList<>(arr));
                return ;
        }
        if(i>=c.length || t<0)
            return;
        if(t-c[i]>=0){
            arr.add(c[i]);
            rec(c,i,t-c[i],arr);
            rec(c,i+1,t-c[i],arr);
            arr.remove(arr.size()-1);
        }
        rec(c,i+1,t,arr);
    }
    public List<List<Integer>> combinationSum(int[] c, int t) {
        ans=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        rec(c,0,t,arr);
        return ans;
    }
}