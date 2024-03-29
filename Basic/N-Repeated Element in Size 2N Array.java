/*In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.

Return the element repeated N times.*/


class Solution {
    public int repeatedNTimes(int[] a) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int n : a){
            if(!set.add(n))
                return n;
        }
        return -1;
    }
}
