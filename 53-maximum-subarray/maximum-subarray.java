
class Solution {
    public int maxSubArray(int[] nums) {
        int maxx = nums[0];
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i], sum + nums[i]);
            maxx = Math.max(maxx, sum);
        }

        return maxx;
    }
}
