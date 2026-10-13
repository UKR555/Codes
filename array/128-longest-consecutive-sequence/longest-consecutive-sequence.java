// // class Solution {
// //     public int longestConsecutive(int[] nums) {
// //         int s[]= Arrays.sort(nums);
// //         int count=0;
// //         for(int i=0;i<s.length;i++){
// //             if(s[i+1]-s[i]==1){
// //                 count+=1;
// //             }
// //         }
// //         return count;
// //     }
// // }


// import java.util.Arrays;

// class Solution {
//     public int longestConsecutive(int[] nums) {
//         if (nums.length == 0) {
//             return 0;
//         }

//         Arrays.sort(nums);

//         int count = 1;
//         int maxCount = 1;

//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] == nums[i - 1]) {
//                 continue;
//             }

//             if (nums[i] - nums[i - 1] == 1) {
//                 count++;
//             } else {
//                 count = 1;
//             }

//             maxCount = Math.max(maxCount, count);
//         }

//         return maxCount;
//     }
// }
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longest = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int length = 1;

                while (numSet.contains(num + length)) {
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;        
    }
}