/*Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.*/

class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        int i = m-1;
        int j = 0;
        while(i>=0){
            if(i<m && j<n && grid[i][j]>=0){
                while(i<m && j<n && grid[i][j]>=0){
                   j++;
               } 
            }
            count = count + (n-j);
            i--;
        }
        return count;
    }
}
