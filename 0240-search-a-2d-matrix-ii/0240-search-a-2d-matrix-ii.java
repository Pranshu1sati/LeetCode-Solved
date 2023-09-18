class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int row[] : matrix){
            int r = row.length-1;
            int l = 0;
            while( r>=l){
                int mid = r + (l-r)/2;
                if(target == row[mid]) return true;
                else if (target>row[mid]) l = mid+1;
                else r = mid-1;
            }
        }
        return false;
    }
}