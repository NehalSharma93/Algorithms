/*There is an m x n matrix that is initialized to all 0's. 
There is also a 2D array indices where each indices[i] = [ri, ci] represents a 0-indexed location to perform some increment operations on the matrix.

For each location indices[i], do both of the following:

Increment all the cells on row ri.
Increment all the cells on column ci.
Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.*/

class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] mat = new int[m][n];
        int numOfLocations = indices.length;
        int j,i, count = 0;
        for(i=0; i<numOfLocations; i++){
            //for entire row
            for(j=0; j<n; j++)
                mat[indices[i][0]][j]++;
            //for entire column
            for(j=0; j<m; j++)
                mat[j][indices[i][1]]++;
        }
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){
                if(mat[i][j]%2!=0)
                    count++;
            }
        }
        return count;
    }
}
