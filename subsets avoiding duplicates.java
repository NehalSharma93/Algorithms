/*Given an integer array nums that may contain duplicates, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.*/

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> subset = new ArrayList<Integer>();
        recursion(res, subset, nums, 0);
        return res;
    }
    
    private void recursion(List<List<Integer>> res, List<Integer> subset, int[] nums, int i){
        if(i>nums.length){
            return;
        }
        res.add(new ArrayList<Integer>(subset));
        for(int j=i; j<nums.length; j++){
            if(j>i && nums[j]==nums[j-1])
                continue;
            subset.add(nums[j]);
            recursion(res, subset, nums, j+1);
            subset.remove(subset.size()-1);
        }
    }
}
