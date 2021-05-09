/*Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target.
You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.

It is guaranteed that the number of unique combinations that sum up to target is less than 150 combinations for the given input.*/


class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
	    List<List<Integer>> res = new ArrayList<List<Integer>>();
	    ArrayList<Integer> subset = new ArrayList<>();
	    int sum = 0;
	    combination(res, subset, 0, candidates, target, sum);
	    return res;
	}
	
	private void combination(List<List<Integer>> res, ArrayList<Integer> subset, int pos, int[] candidates, int target, int sum){
	    if(pos > candidates.length  ||  sum>target)
	        return;
        
	    if(sum==target){
	        res.add(new ArrayList<Integer>(subset));
            return;
        }
	    
	    for(int i=pos; i<candidates.length; i++){
	        if(i>pos && candidates[i]==candidates[i-1])
	            continue;
            
            if(sum + candidates[i] <= target){
                subset.add(candidates[i]);
                combination(res, subset, i, candidates, target, sum+candidates[i]);
                subset.remove(subset.size()-1);
            }
	    }
        return ;
	}
}
