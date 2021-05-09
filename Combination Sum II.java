/*Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.

Each number in candidates may only be used once in the combination.

Note: The solution set must not contain duplicate combinations.*/

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
	    Arrays.sort(candidates);
	    List<List<Integer>> res = new ArrayList<List<Integer>>();
	    ArrayList<Integer> subset = new ArrayList<>();
	    int sum = 0;
	    combination(res, subset, 0, candidates, target, sum);
	    return res;
	}
	
	private void combination(List<List<Integer>> res, ArrayList<Integer> subset, int pos, int[] candidates, int target, int sum){
	    if(pos > candidates.length || sum > target)
	        return;
        
	    if(sum==target){
	        res.add(new ArrayList<Integer>(subset));
	        return;
        }
	    
	    for(int i=pos; i<candidates.length; i++){
	        if(i>pos && candidates[i]==candidates[i-1])
	            continue;
            if(sum + candidates[i] <= target)
               { subset.add(candidates[i]);
                combination(res, subset, i+1, candidates, target, sum+candidates[i]);
                subset.remove(subset.size()-1);}
	    }
	}
}
