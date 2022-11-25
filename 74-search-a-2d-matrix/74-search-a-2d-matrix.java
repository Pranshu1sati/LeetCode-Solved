class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows =matrix.length-1;
        int col=matrix[0].length-1;
        int row=0;
        while(row<=rows && col>-1){
            if(matrix[row][col]==target){return true;}
            else if(matrix[row][col]<target){row++;}
            else{col--;}
        }
        return false;
    }
}