/*A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.

Given an array of numbers arr, return true if the array can be rearranged to form an arithmetic progression. Otherwise, return false.*/

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int len = arr.length;
        if(len==2)
            return true;
        Arrays.sort(arr);
        int diff1 = arr[1] - arr[0];
        for(int i=2; i<len; i++){
            int diff2 = arr[i]-arr[i-1];
            if(diff1!=diff2)
                return false;
            diff1 = diff2;
        }
        return true;
    }
}
