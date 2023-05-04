class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[] [] board = new char[n][n];
        for(int i =0;i<n ;i++){
            Arrays.fill(board[i],'.');
        }
        List<List<String>> result = new ArrayList<>();
        backtracking(n,board,0,result);
        return result;
    } 
    public void backtracking(int n , char[][] board, int row , List<List<String>> result)
    {
        if(row == n ){
           result.add(constructBoard(board));
                return;
        }
        for( int col =0; col<n;col++){
            if(canPlace(board,row,col)){
                board[row][col] = 'Q';
                backtracking(n ,board , row+1, result);
                board[row][col] = '.';
            }
        }
    }
    private boolean canPlace(char[][] board, int row, int col) {
            // column check
            for (int i = row - 1; i >= 0; i--)
                if (board[i][col] == 'Q')
                    return false;

            // diagonal
            for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
                if (board[i][j] == 'Q')
                    return false;

            //diagonal right
            for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++)
                if (board[i][j] == 'Q')
                    return false;

            return true;
        }
    private List<String> constructBoard(char[][] board) {
            List<String> result = new ArrayList<>();
            for (int i = 0; i < board[0].length; i++)
                result.add(new String(board[i]));

            return result;
        }
}