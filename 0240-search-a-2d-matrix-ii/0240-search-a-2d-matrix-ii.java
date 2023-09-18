class Solution {
    // public boolean searchMatrix(int[][] matrix, int target) {
    //     for(int row[] : matrix){
    //         int r = row.length-1;
    //         int l = 0;
    //         while( r>=l){
    //             int mid = r + (l-r)/2;
    //             if(target == row[mid]) return true;
    //             else if (target>row[mid]) l = mid+1;
    //             else r = mid-1;
    //         }
    //     }
    //     return false;
    // }
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int r = matrix[0].length-1;
        while(l<matrix.length && r>=0){
            if(target == matrix[l][r]) return true;
            else if(target < matrix[l][r]) r--;
            else l++;
        }
        return false;
    }
}