/*The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.

Given an integer n, return all distinct solutions to the n-queens puzzle.

Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space, respectively.*/


class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> out = new ArrayList<List<String>>();
        ArrayList<String> ls = new ArrayList<String>();
        int[] cols = new int[n];
        queens(cols, n, 0, out, ls);
        return out;
    }
    
    public void queens(int[] cols, int n, int row, List<List<String>> out, ArrayList<String> ls){
        //if row is exceeded then return
        if(row>=n) {           
            out.add(new ArrayList<String>(ls));
            return;
        }
        
        StringBuffer sb = new StringBuffer(n);
        for(int j=0; j<n; j++)
            sb.append(".");
        
        //checking columns one by one where queen can be placed
        for(int i=0; i<n; i++){
            if(isValid(cols, n, row, i)){
                cols[row] = i;
                sb.replace(i, i+1, "Q");
                ls.add(sb.toString());
                queens(cols, n, row+1, out, ls);
                ls.remove(ls.size()-1);
                sb.replace(i, i+1, ".");
            }
        }
        
        return;
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
