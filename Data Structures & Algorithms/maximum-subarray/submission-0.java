class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i =0;i<nums.length;i++){
            if (currentSum < 0) currentSum = 0;
            
            currentSum += nums[i];       
            maxSum = Math.max(maxSum,currentSum); //2
        }

        return maxSum;
    }
}
