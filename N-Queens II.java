/*The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.

Given an integer n, return the number of distinct solutions to the n-queens puzzle.*/

class Solution {
    public int totalNQueens(int n) {
        if(n==1)
            return 1;
        if(n<4)
            return 0;
        int[] cols = new int[n];
        int count = 0;
        return queens(cols, n, 0, count);
    }
    
    public int queens(int[] cols, int n, int row, int count){
        //if row is exceeded then return
        if(row>=n)
            return count+1;
        
        //checking columns one by one where queen can be placed
        for(int i=0; i<n; i++){
            if(isValid(cols, n, row, i)){
                cols[row] = i;
                count = queens(cols, n, row+1, count);
            }
        }
        
        return count;
    }
    
    public boolean isValid(int[] cols, int n, int row, int col){

        for(int i=0; i<row; i++){
            
            //check if this column is already occupied by previous rows 
            if(cols[i]==col)
                return false;
            
            //check for diagonal conflicts
            if((row-i == col-cols[i]) || row+col == i+cols[i])
                return false;
        }
        
        return true;
    }
}
