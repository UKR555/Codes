// class Solution {
//     public int[] topKFrequent(int[] nums, int k) {
//         ArrayList<Integer> li = new ArrayList<>();
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==nums[i+1]){
//                 continue;
//             }
//             if(nums[i]-nums[i-1]==-1){
                
//                 li.add(nums[i]);
//             }
//         }
//         return new int[li];
//     }
// }


import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> li = new ArrayList<>(map.keySet());

        li.sort((a, b) -> map.get(b) - map.get(a));

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = li.get(i);
        }

        return result;
    }
}
