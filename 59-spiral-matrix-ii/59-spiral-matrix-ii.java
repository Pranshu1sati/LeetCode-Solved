class Solution {
    private int x, y, maxDown, maxRight, maxLeft, maxUp, totalMoves;
    private int switcher = 0;
    private int moveCount;
    
    public int[][] generateMatrix(int n) {
        x = -1;
        y = 0;
        maxDown = n - 1;
        maxRight = n - 1;
        maxLeft = 0;
        maxUp = 1;
        totalMoves = (maxRight + 1) * (maxDown + 1);
        moveCount = 1;
        
        int[][] result = new int[n][n];
      
        while (totalMoves > moveCount - 1) {
            switch(switcher) {
                case 0:
                    moveRight(result);
                    break;
                case 1:
                    moveDown(result);
                    break;
                case 2:
                    moveLeft(result);
                    break;
                case 3:
                    moveUp(result);
                    break;
            }
            
            switcher = (switcher + 1) % 4;
        }
        
        
        return result;
    }
    
    private void moveRight(int[][] result) {
        while (x < maxRight) {
            x++;
            result[y][x] = moveCount;
            moveCount++;
        }
        maxRight--;
    }
    
    private void moveDown(int[][] result) {
        while (y < maxDown) {
            y++;
            result[y][x] = moveCount;
            moveCount++;
        }
        maxDown--;
    }
    
    private void moveLeft(int[][] result) {
        while (x > maxLeft) {
            x--;
            result[y][x] = moveCount;
            moveCount++;
        }
        maxLeft++;
    }
    
    private void moveUp(int[][] result) {
        while (y > maxUp) {
            y--;
            result[y][x] = moveCount;
            moveCount++;
        }
        maxUp++;
    }
}