/*Given a m * n matrix of distinct numbers, return all lucky numbers in the matrix in any order.

A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.*/

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        int rows = matrix.length;
        int columns = matrix[0].length;
        boolean flag = true;
        for(int i=0; i<rows; i++){
            int col = 0;
            int minInRow = Integer.MAX_VALUE;
            for(int j=0; j<columns; j++){
                if(matrix[i][j] < minInRow){
                    minInRow = matrix[i][j];
                    col = j;
                } 
            }
            for(int j=0; j<rows; j++){
                if(matrix[j][col] > minInRow){
                    flag = false;
                    break;
                }
            }            
            if(flag==true)
                result.add(minInRow);
            flag = true;
        }        
        return result;
    }
}
