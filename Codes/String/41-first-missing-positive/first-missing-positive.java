// // class Solution {
// //     public int firstMissingPositive(int[] nums) {
// //         HashSet<Integer> set= new HashSet<>();
// //         for(int i =0;i<nums.length;i++){
// //             if(!set.isContains(nums[i])){
// //                 set.add(nums[i]);
// //             }
// //             else{
// //                 if(set.isContains(nums[i]-1)){
// //                     return nums[i]-1;
// //                 }
// //             }
// //         }
// //         return -1;
// //     }
// // }


// import java.util.HashSet;

// class Solution {
//     public int firstMissingPositive(int[] nums) {
//         HashSet<Integer> set = new HashSet<>();

//         for (int num : nums) {
//             set.add(num);
//         }

//         int i = 1;

//         while (set.contains(i)) {
//             i++;
//         }

//         return i;
//     }
// }
class Solution {
    // Function to swap elements in the array
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        
        // Place each positive integer i at index i-1 if possible
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            }
        }
        
        // Find the first missing positive integer
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        
        // If all positive integers from 1 to n are present, return n + 1
        return n + 1;
    }
}

