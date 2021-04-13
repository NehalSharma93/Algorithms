/*Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array.*/


class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        if(len==1){
            arr[0] = -1;
            return arr;
        }
        int max = arr[len-1];
        arr[len-1] = -1;
        int temp = max;
        for(int i=len-2; i>=0; i--){
            if(arr[i]>max){
                temp = arr[i];
                arr[i] = max;
                max = temp;
            }
            else
                arr[i] = max;
        }
        return arr;
    }
}
