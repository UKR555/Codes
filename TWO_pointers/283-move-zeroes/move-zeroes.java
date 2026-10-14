// class Solution {
//     public void moveZeroes(int[] nums) {
//         Arrays.sort(nums);
//         int left=0,right=nums.length-1;
//         while(left<right){
//             if(nums[left]==0){
//                 nums[left]=nums[right];
//                 left++;
//             }else{
//                 nums[right]=nums[left];
//                 right--;
//             }
            
//             }
//         }

//     }


class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
    }
}
