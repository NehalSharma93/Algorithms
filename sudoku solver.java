public class Solution {
	public void solveSudoku(ArrayList<ArrayList<Character>> a) {
	    int n = a.size();
	    boolean valid = sudoku(a, n, 0, 0);
	    return;
	}
	public boolean sudoku(ArrayList<ArrayList<Character>> a, int n, int r, int c){
	    if(c>=n){
	        c = 0;
	        r++;
	    }
	    
	    if(r>=n)
	        return true;
	        
	    if(a.get(r).get(c)!='.')
	        return sudoku(a, n, r, c+1);
	    
	    for(int i=1; i<=n; i++){
	        char num = String.valueOf(i).charAt(0);
	        if(isValid(a, n, r, c, num)){
	            a.get(r).set(c, num);
	            if(sudoku(a, n, r, c+1))
	                return true;
	            else
	                a.get(r).set(c, '.');
	        }
	    }
	    return false;
	}
	
	public boolean isValid(ArrayList<ArrayList<Character>> a, int n, int r, int c, char i){
	    //check if i is already present in that row or column
	    for(int j=0; j<n; j++){
	        if(a.get(r).get(j)==i || a.get(j).get(c)==i)
	            return false;
	    }
	    //check if i is already present in the block
	    int block_size = (int)Math.sqrt(n);
	    int start_col = (int)(Math.ceil(c/block_size)) * block_size;
	    int start_row = (int)(Math.ceil(r/block_size)) * block_size;
	    for(int j=start_row; j<(start_row+block_size); j++){
	        for(int k=start_col; k<(start_col+block_size); k++){
	            if(a.get(j).get(k)==i)
	                return false;
	        }
	    }
	    return true;
	}
}
