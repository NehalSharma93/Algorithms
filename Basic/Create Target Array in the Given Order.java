/*Given two arrays of integers nums and index. Your task is to create target array under the following rules:

Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.
Return the target array.

It is guaranteed that the insertion operations will be valid.
*/

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int n = nums.length, i;
        for(i=0; i<n; i++)
            result.add(index[i], nums[i]);
        int[] out = new int[n];
        // Iterator<Integer> iter = result.iterator();
        for(i=0; i<n; i++)
            // out[i] = iter.next().intValue();
            out[i] = result.get(i);
        return out;
    }
}
