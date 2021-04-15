/*Given 2 integers A and B and an array of integers C of size N. Element C[i] represents length of ith board.
You have to paint all N boards [C0, C1, C2, C3 … CN-1]. There are A painters available and each of them takes B units of time to paint 1 unit of board.

Calculate and return minimum time required to paint all boards under the constraints that any painter will only paint contiguous sections of board.
NOTE:
1. 2 painters cannot share a board to paint. That is to say, a board cannot be painted partially by one painter, and partially by another.
2. A painter will only paint contiguous boards. Which means a configuration where painter 1 paints board 1 and 3 but not 2 is invalid.

Return the ans % 10000003.*/


public class Solution {
    public int paint(int a, int b, int[] c) {
        // int numOfBoards = c.length;
        int maxBoardLength = 0;
        long sumOfBoardLengths = 0;
        for(int i : c){
            if(i>maxBoardLength)
                maxBoardLength = i;
            sumOfBoardLengths = sumOfBoardLengths + (long)i;
        }
        long minTime = maxBoardLength * (long)b;
        // System.out.println(minTime);
        long maxTime = sumOfBoardLengths * (long)b;
        
        long low = minTime;
        long high = maxTime;
        long midTime;
        while(low<=high){
            midTime = (low + high)/2;
            long time = 0;
            int painter = 1;
            long t;
            for(int i : c){
                t = (long)i * b;
                if((time + t) > midTime){
                    time = t;
                    painter++;
                }
                else 
                    time = time + t;
            }
            if(painter > a)
                low = midTime + 1;
            else
                high = midTime - 1;
        }
        return (int)(low%10000003);
    }
}
