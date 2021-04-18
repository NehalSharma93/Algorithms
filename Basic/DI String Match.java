/*A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:

s[i] == 'I' if perm[i] < perm[i + 1], and
s[i] == 'D' if perm[i] > perm[i + 1].
Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return any of them.*/


class Solution {
    public int[] diStringMatch(String s) {
        int len = s.length();
        int max = len;
        int min = 0;
        int[] res = new int[len+1];
        char[] arr = s.toCharArray();
        for(int i=0;i<len; i++){
            if(arr[i]=='I'){
                res[i] = min;
                min++;
            }
            else {
                res[i] = max;
                max--;
            }
        }
        if(arr[len-1]=='D')
            res[len] = min;
        else
            res[len] = max;
        return res;
    }
}
