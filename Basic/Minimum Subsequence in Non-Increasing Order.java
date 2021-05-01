/*Given the array nums, obtain a subsequence of the array whose sum of elements is strictly greater than the sum of the non included elements in such subsequence. 

If there are multiple solutions, return the subsequence with minimum size and if there still exist multiple solutions, 
return the subsequence with the maximum total sum of all its elements. A subsequence of an array can be obtained by erasing some (possibly zero) elements from the array. 

Note that the solution with the given constraints is guaranteed to be unique. Also return the answer sorted in non-increasing order.*/


class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        int len = nums.length;
        // if(len==1)
        //     return Arrays.asList(nums);
        List<Integer> out = new ArrayList<Integer>();
        Arrays.sort(nums);
        int sum_1 = 0;
        for(int i=0; i<len; i++)
            sum_1 = sum_1 + nums[i];
        int seq = len;
        int sum_2 = 0;
        while(seq>0 && sum_2<=sum_1){
            seq--;
            sum_2 = sum_2 + nums[seq];
            sum_1 = sum_1 - nums[seq];
            out.add(nums[seq]);
        }
        return out;
    }
}
