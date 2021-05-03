/*Given an array A of size N denoting collection of numbers that might contain duplicates, return all possible unique permutations.

NOTE: No 2 entries in the permutation sequence should be the same.*/

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums==null || nums.length==0)
            return res;
        Arrays.sort(nums);
        List<Integer> permutations = new ArrayList<Integer>();
        boolean[] isUsed = new boolean[nums.length];
        permute(nums, permutations, isUsed, res);
        return res;
    }
    private void permute(int[] nums, List<Integer> permutations, boolean[] isUsed, List<List<Integer>> res){
        if(permutations.size()==nums.length){
            res.add(new ArrayList<Integer>(permutations));
            return;
        }
        for(int i=0; i<nums.length; ++i)
        {
            if(isUsed[i])
                continue;
            isUsed[i] = true;
            permutations.add(nums[i]);
            permute(nums, permutations, isUsed, res);
            permutations.remove(permutations.size()-1);
            isUsed[i] = false;
            while(i+1 < nums.length && nums[i]==nums[i+1])
                ++i;
        }
    }
}
