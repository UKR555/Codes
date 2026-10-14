// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         ArrayList<List<Integer>> li = new ArrayList<>();
//         int n = nums.length;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 for(int k=0;k<n;k++){
//                     if(nums[i]!=nums[j]&&nums[i]!=nums[k]&&nums[j]!=nums[k]){
//                         if(nums[i]+nums[j]+nums[k]==0){
//                             li.add(Arrays.asList(nums[i],nums[j],nums[j]));
//                         }
//                     }
//                 }
//             }
//         }
//         return li;
//     }
// }


import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(
                        nums[i], nums[left], nums[right]
                    ));

                    left++;
                    right--;

                    while (left < right &&
                           nums[left] == nums[left - 1]) {
                        left++;
                    }

                    while (left < right &&
                           nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }
}
