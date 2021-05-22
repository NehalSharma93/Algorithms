/*A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

Now consider if some obstacles are added to the grids. How many unique paths would there be?

An obstacle and space is marked as 1 and 0 respectively in the grid.*/

//Non-DP
class Solution {
    int paths;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] track = new int[m][n];
        return calculatePath(0, 0, m, n, track, obstacleGrid); 
    }
    
    public int calculatePath(int i, int j, int m, int n, int[][] track, int[][] obstacleGrid){
        if(i>=m || j>=n)
            return 0;
        
        if(obstacleGrid[i][j]==1)
            return 0;
        
        if(i==m-1 && j==n-1)
            return 1;
        
        if(track[i][j]!=0)
            return track[i][j];
        
        return track[i][j] = calculatePath(i+1, j, m, n, track, obstacleGrid) + calculatePath(i, j+1, m, n, track, obstacleGrid);
    }
}
