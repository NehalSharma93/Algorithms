/*Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.*/

class Solution {
    public boolean isValidSudoku(char[][] board) {
	    int n = 9;
	    return sudoku(board, n, 0, 0);
	}
	public boolean sudoku(char[][] board, int n, int r, int c){
	    if(c>=n){
	        c = 0;
	        r++;
	    }	    
	    if(r>=n)
	        return true;
	        
	    if(board[r][c]=='.')
	        return sudoku(board, n, r, c+1);
	    
	    else{
            if(isValid(board, n, r, c)){
                if(sudoku(board, n, r, c+1))
                    return true;
            }
	    }
	    return false;
	}
	
	public boolean isValid(char[][] board, int n, int r, int c){
	    //check if i is already present in that row or column
        int i = board[r][c];
	    for(int j=0; j<n; j++){
	        if((j!=c && board[r][j]==i) || (j!=r && board[j][c]==i))
	            return false;
        }
	    
	    //check if i is already present in the block
	    int block_size = (int)Math.sqrt(n);
	    int start_col = (int)(Math.ceil(c/block_size)) * block_size;
	    int start_row = (int)(Math.ceil(r/block_size)) * block_size;
	    for(int j=start_row; j<(start_row+block_size); j++){
	        for(int k=start_col; k<(start_col+block_size); k++){
	            if(j!=r && k!=c && board[j][k]==i)
	                return false;
	        }
	    }
	    return true;
    }
}
