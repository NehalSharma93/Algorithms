/*Given an integer array A of size N denoting collection of numbers , return all possible permutations.

NOTE:

No two entries in the permutation sequence should be the same.
For the purpose of this problem, assume that all the numbers in the collection are unique.*/


public class Solution {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> nums) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(nums==null || nums.size()==0)
            return res;
        // Collections.sort(nums);
        List<Integer> permutations = new ArrayList<Integer>();
        boolean[] isUsed = new boolean[nums.size()];
        permuteUnique(nums, permutations, isUsed, res);
        return res;
    }
    private void permuteUnique(List<Integer> nums, List<Integer> permutations, boolean[] isUsed, ArrayList<ArrayList<Integer>> res){
         if(permutations.size()==nums.size()){
             res.add(new ArrayList<Integer>(permutations));
             return;
         }
         for(int i=0; i<nums.size(); ++i)
         {
             if(isUsed[i])
                 continue;
             isUsed[i] = true;
             permutations.add(nums.get(i));
             permuteUnique(nums, permutations, isUsed, res);
             permutations.remove(permutations.size()-1);
             isUsed[i] = false;
         }
    }
}
    
    
    // ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    // public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        
    //     if(A == null)
    //         return null;
    //     if(A.size() == 1){
    //         result.add(new ArrayList<>(A));
    //         return result;
        
    //     }
            
            
    //      permute(A,0);
        
    //     return result;
    // }
    // public void permute(ArrayList<Integer> A,int n){
    //     if( n >= A.size())
    //         return;
    //     if( n == A.size() - 1){
    //         ArrayList<Integer> temp = new ArrayList<>(A);
    //         result.add(temp);
    //     }
    //     for(int i=n;i<A.size();i++){
    //         swap(i,n,A);
    //         permute(A,n+1);
    //         swap(i,n,A);
    //     }
    // }
    // public void swap(int i, int n, ArrayList<Integer> A){
    //     int temp = A.get(i);
    //     A.set(i) = A.get(n);
    //     A.set(n) = temp;
    // }
// }
