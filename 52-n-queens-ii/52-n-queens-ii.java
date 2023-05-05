class Solution {
    public int ways =0;
    public int totalNQueens(int n) {
        char board[][] = new char[n] [n];
       for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
                board[i][j] = 'x';
            }
        }
        nQueens(board , 0);
        return ways;
    }
    public void nQueens(char [] [] board , int row){
        if(row==board.length){
            ways++;
            return;
        }
        for(int j=0; j<board[0].length; j++) {
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row+1);
                board[row][j] = 'x';
            } 
        }
    }
        public boolean isSafe(char board[][], int row, int col) {
        //up
        for(int i=row-1; i>=0; i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        //up left diag
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        //up right diag
        for(int i=row-1, j=col+1; i>=0 && j<board[0].length; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }
    
}