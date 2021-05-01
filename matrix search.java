/*Given a matrix of integers A of size N x M and an integer B. Write an efficient algorithm that searches for integar B in matrix A.

This matrix A has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than or equal to the last integer of the previous row.
Return 1 if B is present in A, else return 0.

NOTE: Rows are numbered from top to bottom and columns are numbered from left to right.



Problem Constraints
1 <= N, M <= 1000
1 <= A[i][j], B <= 106*/


public class Solution {
    public int searchMatrix(int[][] a, int b) {
        int rows = a.length;
        int cols = a[0].length;
        
        //binary search in last col
        int low = 0;
        int high = rows - 1;
        int mid = 0;
        while(low<rows && high>=0 && low<=high){
            mid = (low+high)/2;
            if(a[mid][cols-1]==b)
                return 1;
            else if(a[mid][cols-1]<b)
                low = mid + 1;
            else{
                if(mid>0 && a[mid-1][cols-1]<b)
                    break;
                high = mid - 1;
            }
        }
        
        //binary search inside row
        if(low>=rows)
            return 0;
        int row = mid;
        low = 0;
        high = cols - 1;
        while(low<cols && high>=0 && low<=high){
            mid = (low + high)/2;
            // System.out.println(mid);
            if(a[row][mid]==b)
                return 1;
            else if(a[row][mid]<b){
                low = mid + 1;
                // System.out.println(low);
            }
            else
                high = mid - 1;
        }
        return 0;
    }
}
