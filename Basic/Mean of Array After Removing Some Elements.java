/*Given an integer array arr, return the mean of the remaining integers after removing the smallest 5% and the largest 5% of the elements.

Answers within 10-5 of the actual answer will be considered accepted.*/


class Solution {
    public double trimMean(int[] arr) {
        int len = arr.length;
        int rem = (int)(len*0.05);
        Arrays.sort(arr);
        double sum = 0;
        for(int i=rem; i<len-rem; i++)
            sum += arr[i];
        return sum/(len-(2*rem));
    }
}
