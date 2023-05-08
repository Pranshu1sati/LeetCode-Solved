class Solution {
    public int diagonalSum(int[][] mat) {
        int ans = 0;
        for (int i =0; i<mat[0].length;i++){
            ans+=mat[i][i];
            ans+=mat[i][mat[0].length-1-i];
        }
        return (mat[0].length%2==0)? ans : ans-mat[mat[0].length/2][mat[0].length/2];
    }
}