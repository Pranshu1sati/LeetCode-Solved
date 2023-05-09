class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> res = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        
        int up   = 0 , down  = m-1;
        int left = 0 , right = n-1; 
        
        int dir = 0; 
        // dir = 0 => l to r
        // dir = 1 => u to d
        // dir = 2 => r to l
        // dir = 3 => d to u
        
        while(left<=right && up<=down){
            if(dir==0){
                for(int i=left;i<=right;i++){
                    res.add(matrix[up][i]);
                }
                up++;
            }
            else if(dir==1){
                for(int i=up;i<=down;i++){
                    res.add(matrix[i][right]);
                }
                right--;
            }
            else if(dir==2){
                for(int i=right;i>=left;i--){
                    res.add(matrix[down][i]);
                }
                down--;
            }
            else if(dir==3){
                for(int i=down;i>=up;i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }
            dir++;
            dir = dir%4; //to reset dir 
        }
        
        return res;
    }
}