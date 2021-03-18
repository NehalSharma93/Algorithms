/*Given an array nums of integers, return how many of them contain an even number of digits.*/

class Solution {
    public int findNumbers(int[] nums) {
        int len = nums.length;
        int count = 0;
        int evenNum = 0;
        for(int i=0; i<len; i++){
            while(nums[i]>0){
                nums[i] /= 10;
                count++;
            }
            if(count%2==0)
                evenNum++;
            count = 0;
        }
        return evenNum;
    }
}
