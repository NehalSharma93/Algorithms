class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        // Arrays.fill(result, 0);
        int i, count;
        for(i = 0; i<n; i++){
            count = 0;
            // for(j = 0; j<n; j++){
            //     if(j==i)
            //         continue;
            //     if(nums[j]<nums[i])
            //         count++;
            // }
            for(int num : nums){
                if(num<nums[i])
                    count++;
            }
            result[i] = count;
        }
        return result;
    }
}
