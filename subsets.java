/*Given an integer array nums of unique elements, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.*/

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> subset = new ArrayList<Integer>();
        recursion(res, subset, nums, 0);
        
        //This sorting can be used to get output which lexicographycially in order
        // new Comparator<ArrayList<Integer>> () {
        //     @Override
        //     public int compare(ArrayList<Integer> a, ArrayList<Integer> b) {
        //         for(int i = 0; i<a.size() && i< b.size(); i++){
        //           //  if(a.get(i) < b.get(i) )
        //             if(a.get(i).compareTo(b.get(i))  == 0){
        //                 continue;
        //             }
        //             return a.get(i).compareTo(b.get(i));
        //         }
        //         if(a.size() > b.size())
        //             return 1;
        //         else
        //             if(a.size() == b.size())
        //                 return 0;
        //             else
        //                 return -1;
        //     }
        // };
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
