/*A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?*/

//O(n^2) solution 1 - DP
class Solution {
    
    public int uniquePaths(int m, int n) {
        int[][] paths = new int[m][n];
        for(int i=0; i<m; i++)
            paths[i][0] = 1;
        for(int j=0; j<n; j++)
            paths[0][j] = 1;
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++)
                paths[i][j] = paths[i-1][j] + paths[i][j-1];
        }
        return paths[m-1][n-1];
    }
}

//SOLUTION 2
//Time Complexity: O(m * n)
//Space Complexity: O(m * n)
class Solution {
    
    public int uniquePaths(int m, int n){
        int[][] track = new int[m+1][n+1];
        return calculatePath(0, 0, m, n, track); 
    }
    
    public int calculatePath(int i, int j, int m, int n, int[][] track){
        if(i>=m || j>=n)
            return 0;
        
        if(i==m-1 && j==n-1)
            return 1;
        
        if(track[i][j]!=0)
            return track[i][j];
        
        return track[i][j] = calculatePath(i+1, j, m, n, track) + calculatePath(i, j+1, m, n, track);
    }
}

//SOLUTION 3
//O(2^n) solution
class Solution {
    int paths;
    
    public int uniquePaths(int m, int n) {
        // paths = 0;
        calculatePath(0, 0, m, n);
        return paths;
    }
    
    public void calculatePath(int i, int j, int m, int n){
        if(i+1>=m){
            if(j+1>=n){
                paths++;
                return;
            }
            calculatePath(i, j+1, m, n);
        }
        else if(j+1>=n)
            calculatePath(i+1, j, m, n);
        else{ 
            calculatePath(i+1, j, m, n);
            calculatePath(i, j+1, m, n);
        }
        return;
    }
}
