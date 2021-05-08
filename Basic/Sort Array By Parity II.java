/*Given an array of integers nums, half of the integers in nums are odd, and the other half are even.

Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.

Return any answer array that satisfies this condition.*/


class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int len = nums.length;
        int j = 1;
        // while(i<len && j<len){
        //     while(i<len && nums[i]%2==0)
        //         i = i+2;
        //     while(j<len && nums[j]%2!=0)
        //         j = j+2;
        //     if(i>=len || j>=len)
        //         break;
        //     int temp = nums[j];
        //     nums[j] = nums[i];
        //     nums[i] = temp;
        // }
        for(int i=0; i<len; i+=2){
            if(nums[i]%2==1){
                while(j<len && nums[j]%2==1)
                    j += 2;
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }  
        }
        return nums;
    }
}
