/*Given two integer arrays of equal length target and arr.

In one step, you can select any non-empty sub-array of arr and reverse it. You are allowed to make any number of steps.

Return True if you can make arr equal to target, or False otherwise.*/


class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int len = arr.length;
        Arrays.sort(target);
        Arrays.sort(arr);
        for(int i=0; i<len; i++){
            if(arr[i]!=target[i])
                return false;
        }  
        return true;
    }
}
