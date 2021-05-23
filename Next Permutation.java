/*Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

If such an arrangement is not possible, it must rearrange it as the lowest possible order (i.e., sorted in ascending order).

The replacement must be in place and use only constant extra memory.*/

class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        
        if(len==1)
            return;
        
        int i = len - 1;
        while(i-1>=0 && nums[i]<=nums[i-1])
            i--;
        
        if(i==0){
            for(int j=0; j<len/2; j++){
                int temp = nums[j];
                nums[j] = nums[len-1-j];
                nums[len-1-j] = temp;
            }
            return;
        }
        
        else{
            int j = i-1;
            for(int k = len-1; k>=0; k--){
                if(nums[k] > nums[j]){
                    int temp = nums[k];
                    nums[k] = nums[j];
                    nums[j] = temp;
                    break;
                }
            }
        }
        int m = i;
        int n = len-1;
        while(m<n){
            int temp = nums[m];
            nums[m] = nums[n];
            nums[n] = temp;
            m++;
            n--;
        }
    }    
}
