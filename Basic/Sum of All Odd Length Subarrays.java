/*Given an array of positive integers arr, calculate the sum of all possible odd-length subarrays.

A subarray is a contiguous subsequence of the array.

Return the sum of all odd-length subarrays of arr*/

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int len = arr.length;
        int sum = 0;
        int j, k;
        int groupLength = (len%2==0)?len-1:len;
        for(int i=groupLength; i>=1; i=i-2){
            k = 0;
            while(k<= len - i){
                for(j=k; j<len && j<(k+i); j++)
                    sum = sum + arr[j];
                k++;
            }
        }
        return sum;
    }
}
