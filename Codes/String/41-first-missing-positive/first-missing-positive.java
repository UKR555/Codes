// class Solution {
//     public int firstMissingPositive(int[] nums) {
//         HashSet<Integer> set= new HashSet<>();
//         for(int i =0;i<nums.length;i++){
//             if(!set.isContains(nums[i])){
//                 set.add(nums[i]);
//             }
//             else{
//                 if(set.isContains(nums[i]-1)){
//                     return nums[i]-1;
//                 }
//             }
//         }
//         return -1;
//     }
// }


import java.util.HashSet;

class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int i = 1;

        while (set.contains(i)) {
            i++;
        }

        return i;
    }
}
