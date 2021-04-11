/*You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.

Return the sum of all the unique elements of nums.*/

class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for(int n : nums){
            if(!map.containsKey(n)){
                sum += n;
                map.put(n, 1);
            }
            else if(map.get(n)==1){
                sum -= n;
                map.put(n, 2);
            }
        }
        return sum;
    }
}
