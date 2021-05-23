/*On a 2-dimensional grid, there are 4 types of squares:

1 represents the starting square.  There is exactly one starting square.
2 represents the ending square.  There is exactly one ending square.
0 represents empty squares we can walk over.
-1 represents obstacles that we cannot walk over.
Return the number of 4-directional walks from the starting square to the ending square, that walk over every non-obstacle square exactly once.*/


class Solution {
    int[] xx = {1, 0, 0, -1};
    int[] yy = {0, 1, -1, 0};
    int ans;
    public int uniquePathsIII(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int x = -1, y = -1, freeSquareCount = 0;  
        // int ans = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1){
                    y = j;
                    x = i;
                }
                else if(grid[i][j] == 0)
                    freeSquareCount++;
            }
        }        
        // int[][] track = new int[m][n];
        assert x!=-1;
        calculate(x, y, m, n, freeSquareCount+1, grid);
        return ans;
    }
    
    public void calculate(int x, int y, int m, int n, int freeSquareCount, int[][] grid){
        if(grid[x][y] == 2){
            if(freeSquareCount == 0)
                ans++;
            return;            
        }
        grid[x][y] = -1;
        for(int k=0; k<4; k++){
            int u = x + xx[k];
            int v = y + yy[k];
            if(u>=0 && u<m && v>=0 && v<n && grid[u][v]!=-1)
                calculate(u, v, m, n, freeSquareCount-1, grid);
        }
        grid[x][y] = 0;
    }  
    
}
