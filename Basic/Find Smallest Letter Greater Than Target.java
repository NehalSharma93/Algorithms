/*Given a list of sorted characters letters containing only lowercase letters, and given a target letter target, 
find the smallest element in the list that is larger than the given target.

Letters also wrap around. For example, if the target is target = 'z' and letters = ['a', 'b'], the answer is 'a'.*/

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0;
        int len = letters.length;
        int h = len - 1;
        if(letters[0]>target || letters[h] <= target)
            return letters[0];
        
        while(l<h){
            int mid = l+(h-l)/2;
            if(letters[mid]<=target)
                l = mid+1;
            else
                h = mid;
        }
        return letters[l];
    }
}
