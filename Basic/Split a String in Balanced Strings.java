/*Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

Given a balanced string s, split it in the maximum amount of balanced strings.

Return the maximum amount of split balanced strings.
*/

class Solution {
    public int balancedStringSplit(String s) {
       int r = 0, l = 0, count = 0;
        for(char c : s.toCharArray()){
            if(c=='R')
                r++;
            else if(c=='L')
                l++;
            if(l==r){
                count++;
                l = 0;
                r = 0;
                // System.out.print(" "+ count);
            }
        }
        return count;
    }
}
