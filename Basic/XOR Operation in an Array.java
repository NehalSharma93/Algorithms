/*Given an integer n and an integer start.

Define an array nums where nums[i] = start + 2*i (0-indexed) and n == nums.length.

Return the bitwise XOR of all elements of nums
*/

class Solution {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        int xor = 0;
        for(int i=0; i<n; i++){
            nums[i] = start + 2*i;
            xor = xor^nums[i];
        }
        return xor;
    }
}
