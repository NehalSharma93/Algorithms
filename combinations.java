/*Given two integers n and k, return all possible combinations of k numbers out of the range [1, n].

You may return the answer in any order.

*/

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();        
        findCombination(n, k, 0, new ArrayList<Integer>(), result);
        return result;
    }
    
    public void findCombination(int n, int k, int num, ArrayList<Integer> combination, List<List<Integer>> result){
        
        if(combination.size()==k){
            result.add(new ArrayList<Integer>(combination));
            return;
        }
        
        for(int i=num+1; i<=n; i++){
            combination.add(i);
            findCombination(n, k, i, combination, result);
            combination.remove(combination.size()-1);
        }
    }
}
