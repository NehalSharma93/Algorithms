class Solution {
    public int arraySign(int[] nums) {
        int len = nums.length;
        int negNum = 0;
        for(int i=0; i<len; i++){
            if(nums[i]==0)
                return 0;
            if(nums[i]<0)
                negNum++;
        }
        if(negNum%2==0)
            return 1;
        else
            return -1;
    }
}
