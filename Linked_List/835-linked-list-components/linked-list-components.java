/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] nums) {
        ListNode temp = head;
        Set<Integer> st = new HashSet<>();

        for(int i : nums){
            st.add(i);
        }

        int cnt = 0;
        boolean flag = false;   // to check the streek

        while(temp != null){
            if(st.contains(temp.val) && !flag){
                // if an element is present in nums[] and streek is not ongoing then increase the count
                cnt++;
                flag = true;
            }
            // to checck streek is break or not
            else if (!st.contains(temp.val) && flag)    flag = false;
            temp = temp.next;
        }

        return cnt;
    }
}