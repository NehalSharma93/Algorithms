/*You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians). The soldiers are positioned in front of the civilians. 
That is, all the 1's will appear to the left of all the 0's in each row.

A row i is weaker than a row j if one of the following is true:

The number of soldiers in row i is less than the number of soldiers in row j.
Both rows have the same number of soldiers and i < j.
Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.*/


class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[] arr = new int[m];
        int[] out = new int[k];
        // HashMap<Integer> mp = new HashMap<Integer>(m);
        for(int i=0; i<m; i++){
            //  int soldiers = 0;
            int j = 0;
            while(j<n && mat[i][j]==1){
                arr[i]++;
                j++;
            }
        }
        int min = n+1;
        int minPos = 0;
        for(int j=0; j<k; j++){
            for(int i=0; i<m; i++){
                if(arr[i]<min){
                    min = arr[i];
                    minPos = i;
                }
            }
            out[j] = minPos;
            arr[minPos] = n+1;
            min = n+1;
        }
        return out;
    }
}
