/*We are given a list nums of integers representing a list compressed with run-length encoding.
Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).  
For each such pair, there are freq elements with value val concatenated in a sublist. Concatenate all the sublists from left to right to generate the decompressed list.

Return the decompressed list.
*/

//METHOD 1:  Using ArrayList

class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> output = new ArrayList<Integer>();
        int i = 0, j;
        while(i<n){
            for(j=nums[i]; j>0; j--)
                output.add(nums[i+1]);
            i += 2;
        }
        int[] out = new int[output.size()];
        Iterator<Integer> iterator = output.iterator();
        for(i=0; i<out.length; i++)
            out[i] = iterator.next().intValue();
        return out;
    }
}

//METHOD 2: calculate the size of array before and skip the use of arraylist, this would save time in type conversions
