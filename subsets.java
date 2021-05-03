/*Given an integer array nums of unique elements, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.*/

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> subset = new ArrayList<Integer>();
        recursion(res, subset, nums, 0);
        return res;
    }
    
    private void recursion(List<List<Integer>> res, List<Integer> subset, int[] nums, int i){
        if(i==nums.length){
            res.add(new ArrayList(subset));
            return ;
        }        
        recursion(res, subset, nums, i+1);
        
        // int element = nums[i];
        subset.add(nums[i]);
        recursion(res, subset, nums, i+1);
        subset.remove(subset.size()-1);
    }
}
