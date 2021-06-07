/*Given a array of integers A of size N and an integer B.

Return number of non-empty subsequences of A of size B having sum <= 1000.*/

public class Solution {
    public int solve(int[] A, int B) {
        return helper(A, B, 0, 0, 0);
    }
    
    public int helper(int[] A, int B, int sum, int count, int index){
        if(sum > 1000)
            return 0;
        if(count == B)
            return 1;
        if(index == A.length)
            return 0;
        return (helper(A, B, sum+A[index], count+1, index+1) + helper(A, B, sum, count, index+1));
    }
}
