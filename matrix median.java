/*Problem Description

Given a matrix of integers A of size N x M in which each row is sorted.
Find and return the overall median of the matrix A.

NOTE: No extra memory is allowed.
NOTE: Rows are numbered from top to bottom and columns are numbered from left to right.


Problem Constraints
1 <= N, M <= 10^5
1 <= N*M <= 10^6
1 <= A[i] <= 10^9
N*M is odd*/


public class Solution {
    public int findMedian(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        int med = (1+n*m)/2;
        //finding min el
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<m; i++){
            if(a[i][0]<min)
                min = a[i][0];
            if(a[i][n-1]>max)
                max = a[i][n-1];
        }
        int mid, count, get;
        while(min<=max){
            mid = (min+max)/2;
            //counting number of el lower than mid
            count = 0;
            get = 0;
            for(int i=0;i<m; i++){
                get = Arrays.binarySearch(a[i],mid); 
                // If element is not found in the array the  
                // binarySearch() method returns  
                // (-(insertion_point) - 1). So once we know  
                // the insertion point we can find elements 
                // Smaller than the searched element by the  
                // following calculation 
                if(get < 0) 
                    get = Math.abs(get) - 1; 
                  
                // If element is found in the array it returns  
                // the index(any index in case of duplicate). So we go to last 
                // index of element which will give  the number of  
                // elements smaller than the number including  
                // the searched element. 
                else
                { 
                    while(get < a[i].length && a[i][get] == mid) 
                        get += 1; 
                }
                count = count + get; 
            }
            if(count<med)
                min = mid + 1;
            else
                max = mid - 1;
        }
        return min;
    }
}
