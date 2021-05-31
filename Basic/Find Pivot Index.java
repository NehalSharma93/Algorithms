/*Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.*/


class Solution {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        if(len==1)
            return 0;
        
        int sum = 0;
        for(int n : nums)
            sum += n;
        
        int leftSum = 0;
        int leftPointer = 0;
        for(int i=0; i<len; i++){
            while(leftPointer<i){
                leftSum += nums[leftPointer];
                leftPointer++;
            }
            sum -= nums[i];
            if(leftSum==sum)
                return i;
        }
        return -1;
    }
}
//         int len = nums.length;
//         if(len==1)
//             return 0;
        
//         int[] sums = new int[len];
//         sums[0] = nums[0];
//         for(int i=1; i<len; i++)
//             sums[i] = sums[i-1] + nums[i];
        
//         for(int i=0; i<len; i++){
//             int[] sum = calculateSum(sums, i, len);
//             if(sum[0]==sum[1])
//                 return i;
//         }
//         return -1;
//     }
    
//     public int[] calculateSum(int[] sums, int i, int len){
//         int[] sum = new int[2];
//         // int len = sums.length;
//         sum[0] = (i>0) ? sums[i-1] : 0;
//         sum[1] = (i<len) ? (sums[len-1] - sums[i]) : 0;
//         return sum;
//     }
// }
        
        // for(int i=0; i<len; i++){
        //     int leftSum = 0, rightSum = 0;
        //     int x = 0;
        //     while(x<i){
        //         leftSum += nums[x];
        //         x++;
        //     }
        //     int y = len-1;
        //     while(y>i){
        //         rightSum += nums[y];
        //         y--;
        //     }
        //     if(leftSum==rightSum)
        //         return i;
        // }
        // return -1;
        
        // int l = -1, r = len;
        // int leftSum = 0;
        // rightSum = 0;
        // while(l<r-1){
        //     if(l<r-2 && leftSum<rightSum){
        //         l++;
        //         leftSum += nums[l];
        //     }
        //     else if(l<r-2 && leftSum>=rightSum){
        //         r--;
        //         rightSum += nums[r];
        //     }
        //     else if(l<r-1){
        //         if(leftSum==rightSum)
        //             return l+1;
        //         else
        //             return -1;
        //     }
        // }
        // return -1;
//     }
// }
